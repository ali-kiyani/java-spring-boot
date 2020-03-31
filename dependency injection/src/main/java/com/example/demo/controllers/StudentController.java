package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.service.EmailServiceImpl;
import com.example.demo.service.MessageService;
import com.example.demo.service.SMSServiceImpl;

import net.bytebuddy.description.modifier.MethodArguments;

@RestController
public class StudentController {

	List<Student> studentList = new ArrayList<Student>();
	public StudentController() {
		studentList.add(new Student(1,"muhammad","ali","malikiyani4@gmail.com"));
	}
	
	@RequestMapping("/")
    public List<Student> getStudents() 
    {
      return studentList;
      
    }
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student getStudentById(@RequestParam("id") Integer id) 
    {
      List<Student> s = studentList.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
      if (s.size() > 0)
      {
    	  MessageService service = new EmailServiceImpl();
    	  service.sendMessage("Email injector successful", s.get(0).getFirstName());
    	  service = new SMSServiceImpl();
    	  service.sendMessage("SMS injector successful", s.get(0).getFirstName());    	  
      }
      return (s.size() > 0) ? s.get(0) : null;
      
    }
}
