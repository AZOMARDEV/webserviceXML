package xml.webservcies.application;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import xml.webservcies.models.Operation;
import xml.webservcies.models.Operations;
import xml.webservcies.models.Releve;

public class SerializeReleve {

	public static void main(String[] args) throws Exception {
		Releve releve = new Releve();
		releve.setRIB("011112222333344445555666");
		releve.setDateReleve(new Date());
		releve.setSolde(14500);

		Operation op1 = new Operation();
		op1.setType("CREDIT");
		op1.setDate(new Date());
		op1.setMontant(9000);
		op1.setDescription("Vers Espèce");

		Operation op2 = new Operation();
		op2.setType("DEBIT");
		op2.setDate(new Date());
		op2.setMontant(3400);
		op2.setDescription("Chèque Guichet");

		Operation op3 = new Operation();
		op3.setType("DEBIT");
		op3.setDate(new Date());
		op3.setMontant(120);
		op3.setDescription("Prélèvement Assurance");

		Operation op4 = new Operation();
		op4.setType("CREDIT");
		op4.setDate(new Date());
		op4.setMontant(70000);
		op4.setDescription("Virement");

		List<Operation> operations = new ArrayList<Operation>();
		operations.add(op1);
		operations.add(op2);
		operations.add(op3);
		operations.add(op4);

		Operations operationsReleve = new Operations();
		operationsReleve.setOperations(operations);
		operationsReleve.setDateDebut(new Date());
		operationsReleve.setDateFin(new Date());

		releve.setOperations(operationsReleve);

		JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(releve, new File("releve.xml"));
	}

}
