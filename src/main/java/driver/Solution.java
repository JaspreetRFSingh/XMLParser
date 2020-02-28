package driver;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Document;

import models.Product;
import parsers.ProductParser;
import utilities.DocBuilder;

public class Solution {
	public static void main(String[] args) {
		

		File file = new File("/compositefilereader/src/main/resources/productFeedAlter.xml");
		DocBuilder docBuilder = new DocBuilder(file);
		Document document = docBuilder.getDocument();
		ProductParser productParser = new ProductParser();
		List<Product> products = productParser.getParsedProducts(document);
		
		Iterator<Product> iterator = products.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
