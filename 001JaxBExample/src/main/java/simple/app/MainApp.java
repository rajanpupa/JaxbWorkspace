package simple.app;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

import simple.jaxb.dto.AddressDto;
import simple.jaxb.dto.PersonDto;

public class MainApp {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("simple.jaxb.dto");
		
		Marshaller marshaller = context.createMarshaller();
		
		StringWriter writer = new StringWriter();
		marshaller.marshal(getPerson("Rajan"), writer);
		
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
