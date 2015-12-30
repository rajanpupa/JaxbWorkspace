package org.rajan.javabrains.Messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.rajan.javabrains.Messanger.model.Message;

public class MessageService {

	public List<Message> getAllMessage(){
		
		Message m1 = new Message(1L, "Hello World", "Rajan");
		Message m2 = new Message(1L, "Hello World", "Rajan");
		
		List<Message> lst = new ArrayList<Message>();
		lst.add(m1);
		lst.add(m2);
		
		return lst;
	}
}
