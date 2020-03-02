package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Product {
	
	private int productCode;
	private String productStatus;
	private List<ImageAndColor> imageAndColorsList;
	
	public Product() { }

	public Product(int productCode, String productStatus, List<ImageAndColor> imageAndColorsList) {
		this.productCode = productCode;
		this.productStatus = productStatus;
		this.imageAndColorsList = imageAndColorsList;
	}

	@XmlElement
	public List<ImageAndColor> getImageAndColorsList() {
		return imageAndColorsList;
	}

	@XmlAttribute
	public int getProductCode() {
		return productCode;
	}

	
	@XmlAttribute
	public String getProductStatus() {
		return productStatus;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productCode=" + productCode +
				", productStatus='" + productStatus + '\'' +
				", imageAndColorsList=" + imageAndColorsList +
				'}';
	}
}
