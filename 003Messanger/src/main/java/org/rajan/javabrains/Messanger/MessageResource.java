package org.rajan.javabrains.Messanger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rajan.javabrains.Messanger.model.Message;
import org.rajan.javabrains.Messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService service = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return service.getAllMessage();
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessagesPost(){
		return "Hello World ";
	}
}
