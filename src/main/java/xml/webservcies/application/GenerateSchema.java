package xml.webservcies.application;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.SchemaOutputResolver;
import xml.webservcies.models.Releve;

public class GenerateSchema {
    
	public static void main(String[] args) throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
		SchemaOutputResolver sor = new SchemaOutputResolver() {
			@Override
			public Result createOutput(String namespaceURI, String suggestedFileName) {
				File file = new File("releve.xsd");
				StreamResult result = new StreamResult(file);
				result.setSystemId(file.getName());
				return result;
			}
		};
		jaxbContext.generateSchema(sor);
	}
}
