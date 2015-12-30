package simple.app;

import java.awt.TrayIcon.MessageType;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import simple.jaxb.dto.AddressDto;
import simple.jaxb.dto.PersonDto;

public class MainApp {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("simple.jaxb.dto");
		
		Marshaller marshaller = context.createMarshaller();
		
		StringWriter writer = new StringWriter();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal( new JAXBElement<PersonDto>(new QName("uri","local"), 
				PersonDto.class, getPerson("Rajan")), writer);
		//marshaller.marshal(getPerson("Rajan"), writer);
		
		System.out.println(writer);
	}
	
	public static PersonDto getPerson(String name){
		PersonDto person = new PersonDto();
		
		person.setFirstName("Rajan");
		person.setLastName("Upadhyay");
		
		person.setAddress(new AddressDto());
		
		return person;
	}
}
