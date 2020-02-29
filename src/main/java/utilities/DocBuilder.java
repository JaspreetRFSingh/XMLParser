package utilities;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class DocBuilder {

	DocumentBuilder builder;
	File file;
	Document document;
	
	public DocBuilder(File file) {
		try {
			builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			this.file = file;
		} catch (Exception e) {
			System.out.println("Kya mai yahan pahuncha?");
			e.printStackTrace();
		}
	}
	
	public Document getDocument() {
		System.out.println("--  "+file.getName());
		System.out.println(builder);
		try {
			document = builder.parse(file);
		} catch (Exception e) {
			System.out.println("Yahan exception throw ho rahi hai");
			document = null;
		} 
		return document;
	}
	
}
