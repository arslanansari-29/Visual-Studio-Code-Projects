import cv2

# Load the image
image = cv2.imread(r'C:\Users\Shamim\Downloads\Jasmine.jpg')

if image is None:
    print("Error: Could not load image.")
else:
    print("Image loaded successfully!")

    # Resize the image to fit within a fixed window size
    scale_percent = 50  # Percentage of original size, adjust this as needed
    width = int(image.shape[1] * scale_percent / 100)
    height = int(image.shape[0] * scale_percent / 100)
    resized_image = cv2.resize(image, (width, height))

    # Display the resized image
    cv2.imshow('Resized Image', resized_image)

    # Wait for a key press to close the window
    cv2.waitKey(0)
    cv2.destroyAllWindows()
