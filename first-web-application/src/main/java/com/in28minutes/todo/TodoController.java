package com.in28minutes.todo;

import java.util.Date;

import javax.enterprise.inject.New;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.UserValidation;
@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos" , method = RequestMethod.GET)
	
	public String showLoginPage(ModelMap model)
	{
		
		model.addAttribute("todos",service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo" , method = RequestMethod.GET)
	
	public String showAddPageGET(ModelMap model)
	{
		throw new RuntimeException("Dummy Exception");
		
//		model.addAttribute("todo", new Todo(0,"in28Minutes","",new Date(),false));
//		return "todo";
	}
	@RequestMapping(value="/add-todo" , method = RequestMethod.POST)

	public String showAddPagePOST(Todo todo , ModelMap model)
	{
	
	service.addTodo("in28Minutes", todo.getDesc(), new Date(), false);
	model.clear();
	
	return "redirect:list-todos";
	}
	@RequestMapping(value="/delete-todo" , method = RequestMethod.GET)

	public String deleteTodo(ModelMap model, @RequestParam int id)
	{
	model.clear();
	service.deleteTodo(id);
	
	return "redirect:list-todos";
	}
	@RequestMapping(value="/update-todo" , method = RequestMethod.GET)

	public String updateTodo(ModelMap model, @RequestParam int id)
	{
	model.clear();
	Todo todo = service.retrieveTodo(id);
	model.clear();
	model.addAttribute("todo",todo);
	return "todo";
	}
	@RequestMapping(value="/update-todo" , method = RequestMethod.POST)

	public String updateTodo1(ModelMap model, Todo todo)
	{
	service.updateTodo(todo);
	return "redirect:list-todos";
	}

}
 