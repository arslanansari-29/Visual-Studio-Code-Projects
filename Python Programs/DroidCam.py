import cv2

# DroidCam URL (replace with your phone's IP and port)
url = "http://192.168.29.146:4747/video"

# Open the video stream
cap = cv2.VideoCapture(url)

# Set resolution to 1920x1080 (Full HD)
cap.set(cv2.CAP_PROP_FRAME_WIDTH, 1920)
cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 1080)

while True:
    ret, frame = cap.read()
    if not ret:
        print("Error: Could not read frame.")
        break

    # Display the frame
    cv2.imshow("Phone Camera", frame)

    # Exit on 'q' key press
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()