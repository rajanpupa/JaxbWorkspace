package org.rajan.javabrains.Messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rajan.javabrains.Database.Database;
import org.rajan.javabrains.Messanger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = Database.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Hello World", "Rajan"));
		messages.put(2L, new Message(2, "Hello Jersey", "Rajana"));
	}

	public List<Message> getAllMessage(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(Long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size());
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeId(Long id){
		return messages.remove(id);
	}
	
	
	
}
