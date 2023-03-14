from PIL import Image, ImageDraw, ImageFont

def draw_tony_stark():
    # Create a blank image with a white background
    image = Image.new("RGB", (500,500), "white")
    draw = ImageDraw.Draw(image)

    # Draw a rectangle for the head
    draw.rectangle([(100,100),(400,300)], fill="lightgray",outline="black")

    # Draw a circle for the face
    draw.ellipse([(150,150),(350,250)], fill="white",outline="black")

    # Draw eyes
    draw.ellipse([(200,200),(250,225)], fill="black")
    draw.ellipse([(300,200),(350,225)], fill="black")

    # Draw nose
    draw.polygon([(250,225),(275,250),(300,225)],fill="black")

    # Draw mouth
    draw.arc([(250,275),(300,300)],0,180,fill="black")

    # Add Text
    font = ImageFont.truetype("arial.ttf", 20)
    draw.text((150,320), "Tony Stark", fill=(0,0,0), font=font)
    # Save the image
    image.save("tony_stark.jpg")

draw_tony_stark()
