package xml.webservcies.services;

import java.io.File;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlTransient;
import xml.webservcies.models.Releve;

@WebService(serviceName = "releveServices")
public class ReleveServices {

    @WebMethod
    @XmlTransient
    public Releve getReleve() {
        //return new Releve("34134245",new Date("10-10-2022"),2347.54,new Operations(new Date("10-10-2022"),new Date("10-10-2022"),ListOperations()));

		try {
	        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
	        return releve;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}


    }
}