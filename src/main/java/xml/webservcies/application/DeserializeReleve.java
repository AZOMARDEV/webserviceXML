package xml.webservcies.application;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import xml.webservcies.models.Operation;
import xml.webservcies.models.Releve;

public class DeserializeReleve {
	public static void main(String[] args) throws Exception {
		File file = new File("releve.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Releve releve = (Releve) unmarshaller.unmarshal(file);

		System.out.println("RIB : " + releve.getRIB());
		System.out.println("Date du relevé : " + releve.getDateReleve());
		System.out.println("Solde : " + releve.getSolde());
		System.out.println("Opérations : ");
		System.out.println("Date Debut : " + releve.getOperations().getDateDebut());
		System.out.println("Date Fin : " + releve.getOperations().getDateFin());
		for (Operation operation : releve.getOperations().getOperations()) {
			System.out.println("Type : " + operation.getType());
			System.out.println("Date : " + operation.getDate());
			System.out.println("Montant : " + operation.getMontant());
			System.out.println("Description : " + operation.getDescription());
		}
	}
}
