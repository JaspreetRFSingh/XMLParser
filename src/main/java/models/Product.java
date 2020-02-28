package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	private int productCode;
	private String productStatus;
	private ImageAndColor imageAndColor;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productCode, String productStatus, ImageAndColor imageAndColor) {
		super();
		this.productCode = productCode;
		this.productStatus = productStatus;
		this.imageAndColor = imageAndColor;
	}
	
	@XmlAttribute
	public int getProductCode() {
		return productCode;
	}
	
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	@XmlAttribute
	public String getProductStatus() {
		return productStatus;
	}
	
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	@XmlElement
	public ImageAndColor getImageAndColor() {
		return imageAndColor;
	}
	
	public void setImageAndColor(ImageAndColor imageAndColor) {
		this.imageAndColor = imageAndColor;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productStatus=" + productStatus + ", imageAndColor="
				+ imageAndColor + "]";
	}
	
}
