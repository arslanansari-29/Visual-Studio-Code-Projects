import tkinter as tk
from datetime import datetime
import math

# Constants
WINDOW_WIDTH = 400
WINDOW_HEIGHT = 400
CENTER_X = WINDOW_WIDTH // 2
CENTER_Y = WINDOW_HEIGHT // 2
HAND_LENGTHS = {"hour": 80, "minute": 120, "second": 140}
HAND_COLORS = {"hour": "blue", "minute": "green", "second": "red"}

def draw_clock():
    # Clear the canvas
    canvas.delete("all")

    # Draw clock face
    canvas.create_oval(CENTER_X - 150, CENTER_Y - 150, CENTER_X + 150, CENTER_Y + 150, outline="black", width=2)

    # Get current time
    now = datetime.now()
    hour = now.hour % 12
    minute = now.minute
    second = now.second

    # Calculate angles for each hand
    hour_angle = math.radians((hour * 30) + (minute * 0.5) - 90)
    minute_angle = math.radians((minute * 6) + (second * 0.1) - 90)
    second_angle = math.radians((second * 6) - 90)

    # Draw hour hand
    hour_x = CENTER_X + HAND_LENGTHS["hour"] * math.cos(hour_angle)
    hour_y = CENTER_Y + HAND_LENGTHS["hour"] * math.sin(hour_angle)
    canvas.create_line(CENTER_X, CENTER_Y, hour_x, hour_y, fill=HAND_COLORS["hour"], width=6)
    canvas.create_text(hour_x, hour_y, text=str(hour), fill=HAND_COLORS["hour"], font=("Arial", 12, "bold"))

    # Draw minute hand
    minute_x = CENTER_X + HAND_LENGTHS["minute"] * math.cos(minute_angle)
    minute_y = CENTER_Y + HAND_LENGTHS["minute"] * math.sin(minute_angle)
    canvas.create_line(CENTER_X, CENTER_Y, minute_x, minute_y, fill=HAND_COLORS["minute"], width=4)
    canvas.create_text(minute_x, minute_y, text=str(minute), fill=HAND_COLORS["minute"], font=("Arial", 10, "bold"))

    # Draw second hand
    second_x = CENTER_X + HAND_LENGTHS["second"] * math.cos(second_angle)
    second_y = CENTER_Y + HAND_LENGTHS["second"] * math.sin(second_angle)
    canvas.create_line(CENTER_X, CENTER_Y, second_x, second_y, fill=HAND_COLORS["second"], width=2)
    canvas.create_text(second_x, second_y, text=str(second), fill=HAND_COLORS["second"], font=("Arial", 8, "bold"))

    # Schedule the next update
    root.after(1000, draw_clock)

# Create the main window
root = tk.Tk()
root.title("Digital + Analog Clock")
root.geometry(f"{WINDOW_WIDTH}x{WINDOW_HEIGHT}")

# Create a canvas to draw the clock
canvas = tk.Canvas(root, width=WINDOW_WIDTH, height=WINDOW_HEIGHT, bg="white")
canvas.pack()

# Start the clock
draw_clock()

# Run the application
root.mainloop()