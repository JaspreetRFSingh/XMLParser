package parsers;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.ImageAndColor;
import models.Product;

public class ProductParser {
	List<Product> products;
	
	
	public ProductParser() {
		products = new ArrayList<Product>();
	}
	
	public List<Product> getParsedProducts(Document document) {
		 
		try {
			NodeList nodes = document.getElementsByTagName("product");
			int numberOfNodes = nodes.getLength();

			for (int i = 0; i < numberOfNodes; i++) {
				Element element = (Element) nodes.item(i);
				NodeList imageAndColor = element.getElementsByTagName("imageAndColor");
				Node productCode = element.getAttributeNode("productCode");
				Node productStatus = element.getAttributeNode("productStatus");
				int prodCode = Integer.parseInt(productCode.getNodeValue());
				String prodStatus = productStatus.getNodeValue();
				String line = imageAndColor.item(0).getTextContent();
				
				//Converting JSON to pojo
				ImageAndColor iac = new ObjectMapper().readValue(line.substring(2, line.length() - 2),ImageAndColor.class);
				
				Product product = new Product(prodCode, prodStatus, iac);
				products.add(product);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
}
