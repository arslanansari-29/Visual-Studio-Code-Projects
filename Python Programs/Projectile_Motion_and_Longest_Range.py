import matplotlib.pyplot as plt
import numpy as np

# Constants
v = 30  # Initial speed in m/s
g = 9.8  # Acceleration due to gravity in m/s^2

# Time steps
t = np.linspace(0, 6, num=500)

# Function to calculate x, y for a given angle (ideal projectile, no air resistance)
def projectile_ideal(v, angle_deg):
    theta = np.radians(angle_deg)
    t_flight = 2 * v * np.sin(theta) / g
    t_vals = np.linspace(0, t_flight, num=300)
    x = v * np.cos(theta) * t_vals
    y = v * np.sin(theta) * t_vals - 0.5 * g * t_vals**2
    return x, y

# Angles to simulate
angles = [15, 30, 45, 60, 75]

# Plot ideal trajectories
plt.figure(figsize=(10, 6))
for angle in angles:
    x, y = projectile_ideal(v, angle)
    plt.plot(x, y, label=f"{angle}°")

plt.title("Projectile Trajectories at Different Angles (No Air Resistance)")
plt.xlabel("Horizontal Distance (m)")
plt.ylabel("Vertical Height (m)")
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()

# Simulate air resistance by adding a deceleration term proportional to velocity (simplified drag)
def projectile_with_air_resistance(v0, angle_deg, k=0.05, dt=0.01):
    theta = np.radians(angle_deg)
    vx = v0 * np.cos(theta)
    vy = v0 * np.sin(theta)

    x, y = [0], [0]
    while y[-1] >= 0:
        v = np.sqrt(vx**2 + vy**2)
        ax = -k * v * vx
        ay = -g - k * v * vy
        vx += ax * dt
        vy += ay * dt
        x.append(x[-1] + vx * dt)
        y.append(y[-1] + vy * dt)
    return x, y

# Plot trajectories with air resistance
plt.figure(figsize=(10, 6))
for angle in angles:
    x, y = projectile_with_air_resistance(v, angle)
    plt.plot(x, y, label=f"{angle}°")

plt.title("Projectile Trajectories at Different Angles (With Air Resistance)")
plt.xlabel("Horizontal Distance (m)")
plt.ylabel("Vertical Height (m)")
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()
