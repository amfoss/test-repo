import streamlit as st
from PIL import Image
import cv2
import numpy as np
import os
from rembg import remove

st.set_page_config(layout="wide")

st.title("Image Background Removal and Replacement")
st.write("Remove Background and Replace a Dream Background!")

os.makedirs('org_py', exist_ok=True)
os.makedirs('mask_py', exist_ok=True)

st.title("Capture an Image")
img_file_buffer = st.camera_input("Take a picture")

if img_file_buffer is not None:
    bytes_data = img_file_buffer.getvalue()
    cv2_img = cv2.imdecode(np.frombuffer(bytes_data, np.uint8), cv2.IMREAD_COLOR)

    st.write(type(cv2_img))
    st.write(cv2_img.shape)

    # Save the captured image to a local file
    local_filename = 'org_py/captured_image.jpg'
    cv2.imwrite(local_filename, cv2_img)
    st.success(f"Image saved as {local_filename}")

    st.title("Choose your Background location")
    selected_background = st.selectbox("Select a Background", ["Beach", "Forest", "Space"])

    if selected_background:
        background_images = {
            "Beach": "path_to_beach_image.jpg",
            "Forest": "path_to_forest_image.jpg",
            "Space": "path_to_space_image.jpg",
        }

        # Get the selected background image file path
        background_file = background_images[selected_background]

        st.title("Removing Background from your Image and Replacing it with Dream Background")
        threshold = st.slider("Background Threshold", 0, 255, value=50, step=5)

        # Process the captured image with background removal and replacement
        subject_file = local_filename
        output_file = 'mask_py/' + os.path.basename(subject_file)
        with open(output_file, 'wb') as f:
            subject_img = open(subject_file, 'rb').read()
            subject = remove(subject_img, alpha_matting=True, alpha_matting_foreground_threshold=threshold)
            f.write(subject)

        # Load the background image and subject image
        background_img = Image.open(background_file)
        subject_img = Image.open(output_file)

        # Resize the background image to match the size of the subject image
        background_img = background_img.resize(subject_img.size)

        # Paste the subject image onto the background
        merged_image = Image.alpha_composite(background_img.convert("RGBA"), subject_img)

        # Save the merged image
        merged_image_path = 'mask_py/background.jpg'
        merged_image.save(merged_image_path, format='jpeg')

        # Display the merged image
        st.image(merged_image_path, caption='Merged Image', use_column_width=True)

    else:
        st.warning("Please select a background.")
else:
    st.warning("Please capture an image.")
