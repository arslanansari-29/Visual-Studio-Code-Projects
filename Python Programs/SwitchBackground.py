import tkinter as tk

class TurnOnOffApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Turn On/Off Button")

        # Set the initial state to off
        self.state = False

        # Create a button
        self.toggle_button = tk.Button(root, text="Turn On", command=self.toggle)
        self.toggle_button.pack(pady=20)

    def toggle(self):
        # Toggle the state
        self.state = not self.state

        # Update the button text based on the state
        if self.state:
            self.toggle_button.config(text="Turn Off")
            # Change the background color to blue when turned on
            self.root.configure(bg="blue")
            print("Turned On")
        else:
            self.toggle_button.config(text="Turn On")
            # Change the background color to white when turned off
            self.root.configure(bg="white")
            print("Turned Off")

if __name__ == "__main__":
    root = tk.Tk()
    app = TurnOnOffApp(root)
    root.mainloop()

