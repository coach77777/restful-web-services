package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;


@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "in28minutes", "Learn to Dance", new Date(), false ));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn Micro Services", new Date(), false ));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn Angular", new Date(), false ));
		
	}
	
	public List<Todo> findAll(){
		return todos;
		
	}
	
	

}
