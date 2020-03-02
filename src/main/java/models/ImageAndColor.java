package models;

import java.util.Arrays;

public class ImageAndColor {
	  
	private String color;
	private String imageUrl;
	private String colorValue;
	private String colorTitle;
	private String[] images;
	
	
	public ImageAndColor() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ImageAndColor(String color, String imageUrl, String colorValue, String colorTitle, String[] images) {
		super();
		this.color = color;
		this.imageUrl = imageUrl;
		this.colorValue = colorValue;
		this.colorTitle = colorTitle;
		this.images = images;
	}

	@Override
	public String toString() {
		return "ImageAndColor{" +
				"color='" + color + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", colorValue='" + colorValue + '\'' +
				", colorTitle='" + colorTitle + '\'' +
				", images=" + Arrays.toString(images) +
				'}';
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getColorValue() {
		return colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	public String getColorTitle() {
		return colorTitle;
	}

	public void setColorTitle(String colorTitle) {
		this.colorTitle = colorTitle;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

}
