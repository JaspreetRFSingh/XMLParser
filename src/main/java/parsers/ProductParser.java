package parsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
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
			System.out.println("Number of products: "+numberOfNodes);
			for (int i = 0; i < numberOfNodes; i++) {
				Element element = (Element) nodes.item(i);
				NodeList imageAndColor = element.getElementsByTagName("imageAndColor");
				Node productCode = element.getAttributeNode("productCode");
				Node productStatus = element.getAttributeNode("productStatus");
				int prodCode = Integer.parseInt(productCode.getNodeValue());
				String prodStatus = productStatus.getNodeValue();
				String line = imageAndColor.item(0).getTextContent();

				ObjectMapper objectMapper = new ObjectMapper();
				List<ImageAndColor> imagesAndColors = Arrays.asList(objectMapper.readValue(line,ImageAndColor[].class));

				Product product = new Product(prodCode, prodStatus, imagesAndColors);
				products.add(product);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
}
