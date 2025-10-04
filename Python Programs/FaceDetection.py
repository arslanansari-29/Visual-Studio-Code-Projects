import cv2
import tkinter as tk
from tkinter import filedialog, messagebox

class FaceDetectionApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Face Detection Program")
        
        # Load face detection classifier
        self.face_cascade = cv2.CascadeClassifier(
            cv2.data.haarcascades + 'haarcascade_frontalface_default.xml'
        )

        # Display dimensions
        self.max_display_width = 1920
        self.max_display_height = 1080

        self.create_widgets()

    def create_widgets(self):
        """Create GUI elements"""
        main_frame = tk.Frame(self.root, padx=20, pady=20)
        main_frame.pack()

        # Instruction label (fixed missing parenthesis)
        lbl_instruction = tk.Label(
            main_frame, 
            text="Import an image to detect faces", 
            font=('Arial', 14)
        )  # Added closing parenthesis here
        lbl_instruction.pack(pady=10)

        # Import button
        btn_import = tk.Button(
            main_frame,
            text="Select Image",
            command=self.select_image,
            width=20,
            height=2,
            bg='#4CAF50',
            fg='white'
        )
        btn_import.pack(pady=10)

        # Exit button
        btn_exit = tk.Button(
            main_frame,
            text="Exit",
            command=self.root.destroy,
            width=20,
            height=2,
            bg='#f44336',
            fg='white'
        )
        btn_exit.pack(pady=10)

    def select_image(self):
        """Handle image selection"""
        file_types = [
            ('Image files', '*.jpg *.jpeg *.png *.bmp *.tiff'),
            ('All files', '*.*')
        ]
        file_path = filedialog.askopenfilename(filetypes=file_types)
        
        if file_path:
            self.detect_faces(file_path)

    def resize_with_aspect_ratio(self, image):
        """Resize image proportionally"""
        height, width = image.shape[:2]
        scale = 1
        
        if width > self.max_display_width or height > self.max_display_height:
            width_scale = self.max_display_width / width
            height_scale = self.max_display_height / height
            scale = min(width_scale, height_scale)
            
        new_dim = (int)(width * scale), int(height * scale)
        return cv2.resize(image, new_dim, interpolation=cv2.INTER_AREA)

    def detect_faces(self, image_path):
        """Detect and display faces"""
        try:
            img = cv2.imread(image_path)
            if img is None:
                raise ValueError("Could not read image")
            
            # Face detection
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
            faces = self.face_cascade.detectMultiScale(
                gray, 
                scaleFactor=1.1, 
                minNeighbors=5, 
                minSize=(30, 30)
            )  # Added closing parenthesis here

            # Draw rectangles
            for (x, y, w, h) in faces:
                cv2.rectangle(img, (x, y), (x+w, y+h), (0, 255, 0), 2)

            # Resize and display
            resized_img = self.resize_with_aspect_ratio(img)
            cv2.imshow('Face Detection Result', resized_img)
            cv2.waitKey(0)
            cv2.destroyAllWindows()

        except Exception as e:
            messagebox.showerror("Error", f"Failed to process image:\n{str(e)}")

if __name__ == "__main__":
    root = tk.Tk()
    app = FaceDetectionApp(root)
    root.mainloop()