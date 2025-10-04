import pygame
import random
import sys
import time
import os

# Initialize pygame
pygame.init()

# Screen dimensions
WIDTH, HEIGHT = 1366, 768
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Galactic Arrow")

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
NEON_BLUE = (0, 191, 255)
PURPLE = (128, 0, 128)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
YELLOW = (255, 255, 0)
ORANGE = (255, 165, 0)

# Set the directory where your assets are located
asset_directory = "D:/D DRIVE/Arslan Folder/Documents/Visual Code Projects"

# Load and resize player spaceship (increased size by 25%)
player_spaceship = pygame.image.load(os.path.join(asset_directory, "Player_Spaceship.png"))
player_spaceship = pygame.transform.scale(player_spaceship, (75, 75))  # Resize to 75x75

# Load and resize enemy spaceship (increased size by 25%)
enemy_spaceship = pygame.image.load(os.path.join(asset_directory, "Enemy_Spaceship.png"))
enemy_spaceship = pygame.transform.scale(enemy_spaceship, (75, 75))  # Resize to 75x75

# Load and resize player bullet (increased size by 2x)
player_bullet_img = pygame.image.load(os.path.join(asset_directory, "Player_Bullet.png"))
player_bullet_img = pygame.transform.scale(player_bullet_img, (38, 76))  # Resize to 38x76 (2x size)
player_bullet_img = pygame.transform.rotate(player_bullet_img, 90)  # Rotate 90 degrees to the left

# Load and resize enemy bullet (increased size by 2x)
enemy_bullet_img = pygame.image.load(os.path.join(asset_directory, "Enemy_Bullet.png"))
enemy_bullet_img = pygame.transform.scale(enemy_bullet_img, (38, 76))  # Resize to 38x76 (2x size)
enemy_bullet_img = pygame.transform.rotate(enemy_bullet_img, 270)  # Rotate 90 degrees to the left

# Game variables
player_x = WIDTH // 2 - 37  # Adjusted for new size (75x75)
player_y = HEIGHT - 150
player_speed = 15
bullet_speed = 10
enemy_speed = 5
enemy_bullet_speed = 7
score = 0
best_score = 0

# Lists to store bullets, enemies, and abilities
bullets = []
enemy_bullets = []
enemies = []
abilities = []

# Clock to control frame rate
clock = pygame.time.Clock()

# Game states
START_MENU = 0
PLAYING = 1
GAME_OVER = 2
PAUSED = 3
game_state = START_MENU

# Burst firing variables
burst_fire = False
burst_delay = 100  # Time between bullets in burst mode (in milliseconds)
last_shot_time = 0

# Ability variables
invincible = False
firing_mode = 1  # 1 = single, 2 = double, 3 = triple, etc.
speed_boost = False
ability_duration = 10  # Duration of abilities in seconds
ability_timers = {}  # To track when abilities expire

# Menu variables
menu_options = ["Start Game", "Quit"]
pause_options = ["Resume", "Restart", "Return to Home", "Quit"]
selected_option = 0  # Index of the currently selected menu option

# Function to display centered text on screen
def draw_centered_text(text, font_size, color, y_offset=0):
    font = pygame.font.SysFont("Arial", font_size)
    text_surface = font.render(text, True, color)
    text_rect = text_surface.get_rect(center=(WIDTH // 2, HEIGHT // 2 + y_offset))
    screen.blit(text_surface, text_rect)

# Function to reset the game
def reset_game():
    global player_x, player_y, bullets, enemy_bullets, enemies, score, game_state, invincible, firing_mode, speed_boost, ability_timers
    player_x = WIDTH // 2 - 37  # Adjusted for new size (75x75)
    player_y = HEIGHT - 150
    bullets = []
    enemy_bullets = []
    enemies = []
    abilities = []
    score = 0
    invincible = False
    firing_mode = 1
    speed_boost = False
    ability_timers = {}
    game_state = PLAYING

# Function to spawn abilities
def spawn_ability(x, y):
    ability_type = random.choice(["invincible", "firing", "speed"])
    if ability_type == "invincible":
        ability_color = GREEN
        ability_shape = pygame.Surface((45, 45), pygame.SRCALPHA)
        pygame.draw.circle(ability_shape, ability_color, (22, 22), 22)
    elif ability_type == "firing":
        ability_color = YELLOW
        ability_shape = pygame.Surface((45, 45), pygame.SRCALPHA)
        pygame.draw.rect(ability_shape, ability_color, (0, 0, 45, 45))
    elif ability_type == "speed":
        ability_color = ORANGE
        ability_shape = pygame.Surface((45, 45), pygame.SRCALPHA)
        pygame.draw.polygon(ability_shape, ability_color, [(22, 0), (0, 45), (45, 45)])
    abilities.append({"type": ability_type, "shape": ability_shape, "x": x, "y": y})

# Function to draw the start menu
def draw_start_menu():
    screen.fill(BLACK)
    draw_centered_text("Galactic Arrow", 96, NEON_BLUE, -200)

    for i, option in enumerate(menu_options):
        color = WHITE if i == selected_option else NEON_BLUE
        draw_centered_text(option, 48, color, 50 + i * 100)

# Function to draw the pause menu
def draw_pause_menu():
    screen.fill(BLACK)
    draw_centered_text("Paused", 96, NEON_BLUE, -200)

    for i, option in enumerate(pause_options):
        color = WHITE if i == selected_option else NEON_BLUE
        draw_centered_text(option, 48, color, 50 + i * 100)

# Function to handle menu selection
def handle_menu_selection():
    global game_state, running, selected_option
    if game_state == START_MENU:
        if selected_option == 0:  # Start Game
            reset_game()
        elif selected_option == 1:  # Quit
            running = False
    elif game_state == PAUSED:
        if selected_option == 0:  # Resume
            game_state = PLAYING
        elif selected_option == 1:  # Restart
            reset_game()
        elif selected_option == 2:  # Return to Home
            game_state = START_MENU
        elif selected_option == 3:  # Quit
            running = False

# Game loop
running = True
while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.KEYDOWN:
            if game_state == START_MENU or game_state == PAUSED:
                if event.key == pygame.K_UP:
                    selected_option = (selected_option - 1) % len(pause_options if game_state == PAUSED else menu_options)
                if event.key == pygame.K_DOWN:
                    selected_option = (selected_option + 1) % len(pause_options if game_state == PAUSED else menu_options)
                if event.key == pygame.K_RETURN:
                    handle_menu_selection()
            if game_state == PLAYING:
                if event.key == pygame.K_SPACE:
                    burst_fire = True  # Enable burst firing
                if event.key == pygame.K_ESCAPE:  # Pause the game
                    game_state = PAUSED
                    selected_option = 0  # Reset selected option for pause menu
            if game_state == GAME_OVER:
                if event.key == pygame.K_r:  # Restart the game
                    reset_game()
                if event.key == pygame.K_q:  # Quit the game
                    running = False
        if event.type == pygame.KEYUP:
            if event.key == pygame.K_SPACE:
                burst_fire = False  # Disable burst firing

        # Mouse interaction
        if event.type == pygame.MOUSEBUTTONDOWN:
            if game_state == START_MENU or game_state == PAUSED:
                mouse_pos = pygame.mouse.get_pos()
                options = pause_options if game_state == PAUSED else menu_options
                for i, option in enumerate(options):
                    text_rect = pygame.Rect(WIDTH // 2 - 100, HEIGHT // 2 + 50 + i * 100 - 25, 200, 50)
                    if text_rect.collidepoint(mouse_pos):
                        selected_option = i
                        handle_menu_selection()

    # Update game state
    if game_state == PLAYING:
        # Update player position
        keys = pygame.key.get_pressed()
        if keys[pygame.K_a] and player_x > 0:
            player_x -= player_speed * (1.5 if speed_boost else 1)
        if keys[pygame.K_d] and player_x < WIDTH - 75:  # Adjusted for new size (75x75)
            player_x += player_speed * (1.5 if speed_boost else 1)

        # Burst firing mode
        current_time = pygame.time.get_ticks()
        if burst_fire and current_time - last_shot_time > burst_delay:
            for i in range(firing_mode):
                offset = (i - (firing_mode - 1) / 2) * 30  # Spread bullets for double/triple firing
                # Spawn bullets from the center of the player's spaceship
                bullets.append([player_x + 37 - 19 + offset, player_y])  # 37 = half of 75 (player width), 19 = half of 38 (bullet width)
            last_shot_time = current_time

        # Update player bullets
        for bullet in bullets:
            bullet[1] -= bullet_speed
            if bullet[1] < 0:
                bullets.remove(bullet)

        # Spawn enemies
        if random.randint(1, 60) == 1:  # Reduced enemy spawn rate
            enemy_x = random.randint(0, WIDTH - 75)  # Adjusted for new size (75x75)
            enemy_y = -75  # Adjusted for new size (75x75)
            enemies.append([enemy_x, enemy_y])

        # Update enemies
        for enemy in enemies:
            enemy[1] += enemy_speed
            if enemy[1] > HEIGHT:
                enemies.remove(enemy)

            # Enemy shooting (reduced firing rate)
            if random.randint(1, 200) == 1:  # 0.5% chance per frame to shoot
                enemy_bullets.append([enemy[0] + 37 - 19, enemy[1] + 75])  # 37 = half of 75 (enemy width), 19 = half of 38 (bullet width)

        # Update enemy bullets
        for bullet in enemy_bullets:
            bullet[1] += enemy_bullet_speed
            if bullet[1] > HEIGHT:
                enemy_bullets.remove(bullet)

        # Check for collisions between player bullets and enemies
        for bullet in bullets:
            for enemy in enemies:
                if (
                    bullet[0] < enemy[0] + 75  # Adjusted for new size (75x75)
                    and bullet[0] + 38 > enemy[0]  # Adjusted for new size (38x76)
                    and bullet[1] < enemy[1] + 75  # Adjusted for new size (75x75)
                    and bullet[1] + 76 > enemy[1]  # Adjusted for new size (38x76)
                ):
                    bullets.remove(bullet)
                    enemies.remove(enemy)
                    score += 10  # Reward for hitting an enemy
                    if score > best_score:
                        best_score = score  # Update best score
                    # Spawn ability randomly (5% chance)
                    if random.randint(1, 20) == 1:  # 5% chance to drop an ability
                        spawn_ability(enemy[0], enemy[1])

        # Check for collisions between player bullets and enemy bullets
        for player_bullet in bullets:
            for enemy_bullet in enemy_bullets:
                if (
                    player_bullet[0] < enemy_bullet[0] + 38  # Adjusted for new size (38x76)
                    and player_bullet[0] + 38 > enemy_bullet[0]  # Adjusted for new size (38x76)
                    and player_bullet[1] < enemy_bullet[1] + 76  # Adjusted for new size (38x76)
                    and player_bullet[1] + 76 > enemy_bullet[1]  # Adjusted for new size (38x76)
                ):
                    bullets.remove(player_bullet)
                    enemy_bullets.remove(enemy_bullet)

        # Check for collisions between player and enemy bullets
        if not invincible:
            for bullet in enemy_bullets:
                if (
                    player_x < bullet[0] + 38  # Adjusted for new size (38x76)
                    and player_x + 75 > bullet[0]  # Adjusted for new size (75x75)
                    and player_y < bullet[1] + 76  # Adjusted for new size (38x76)
                    and player_y + 75 > bullet[1]  # Adjusted for new size (75x75)
                ):
                    game_state = GAME_OVER

        # Check for collisions between player and enemies
        if not invincible:
            for enemy in enemies:
                if (
                    player_x < enemy[0] + 75  # Adjusted for new size (75x75)
                    and player_x + 75 > enemy[0]  # Adjusted for new size (75x75)
                    and player_y < enemy[1] + 75  # Adjusted for new size (75x75)
                    and player_y + 75 > enemy[1]  # Adjusted for new size (75x75)
                ):
                    game_state = GAME_OVER

        # Update abilities
        for ability in abilities:
            ability["y"] += 3  # Move ability downward
            # Check for collision with player
            if (
                player_x < ability["x"] + 45
                and player_x + 75 > ability["x"]  # Adjusted for new size (75x75)
                and player_y < ability["y"] + 45
                and player_y + 75 > ability["y"]  # Adjusted for new size (75x75)
            ):
                if ability["type"] == "invincible":
                    invincible = True
                    ability_timers["invincible"] = time.time() + ability_duration
                elif ability["type"] == "firing":
                    firing_mode += 1
                    ability_timers["firing"] = time.time() + ability_duration
                elif ability["type"] == "speed":
                    speed_boost = True
                    ability_timers["speed"] = time.time() + ability_duration
                abilities.remove(ability)

        # Check ability timers
        current_time = time.time()
        if "invincible" in ability_timers and current_time > ability_timers["invincible"]:
            invincible = False
            del ability_timers["invincible"]
        if "firing" in ability_timers and current_time > ability_timers["firing"]:
            firing_mode = 1
            del ability_timers["firing"]
        if "speed" in ability_timers and current_time > ability_timers["speed"]:
            speed_boost = False
            del ability_timers["speed"]

    # Draw everything
    screen.fill(BLACK)

    if game_state == START_MENU:
        draw_start_menu()
    elif game_state == PLAYING:
        screen.blit(player_spaceship, (player_x, player_y))
        for bullet in bullets:
            screen.blit(player_bullet_img, (bullet[0], bullet[1]))  # Use player_bullet_img here
        for bullet in enemy_bullets:
            screen.blit(enemy_bullet_img, (bullet[0], bullet[1]))  # Use enemy_bullet_img here
        for enemy in enemies:
            screen.blit(enemy_spaceship, (enemy[0], enemy[1]))
        for ability in abilities:
            screen.blit(ability["shape"], (ability["x"], ability["y"]))
        draw_centered_text(f"Score: {score}", 36, WHITE, -HEIGHT // 2 + 50)
        draw_centered_text(f"Best Score: {best_score}", 36, WHITE, -HEIGHT // 2 + 100)
        if invincible:
            draw_centered_text("Invincible!", 36, GREEN, -HEIGHT // 2 + 150)
        if firing_mode > 1:
            draw_centered_text(f"Firing Mode: {firing_mode}", 36, YELLOW, -HEIGHT // 2 + 200)
        if speed_boost:
            draw_centered_text("Speed Boost!", 36, ORANGE, -HEIGHT // 2 + 250)

    elif game_state == GAME_OVER:
        draw_centered_text("Game Over", 96, RED, -200)
        draw_centered_text(f"Final Score: {score}", 48, WHITE, -50)
        draw_centered_text("Press R to Restart or Q to Quit", 36, WHITE, 100)

    elif game_state == PAUSED:
        draw_pause_menu()

    # Update display
    pygame.display.flip()

    # Cap frame rate
    clock.tick(60)

# Quit pygame
pygame.quit()
sys.exit()
