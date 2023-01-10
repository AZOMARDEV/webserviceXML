package xml.webservcies.models;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
	@XmlAttribute
	private Date dateDebut;
	@XmlAttribute
	private Date dateFin;
	@XmlElement
	private List<Operation> operations;

	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operations(Date dateDebut, Date dateFin, List<Operation> operations) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.operations = operations;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

}
