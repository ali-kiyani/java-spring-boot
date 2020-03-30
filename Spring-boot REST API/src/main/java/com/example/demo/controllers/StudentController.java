package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;

@RestController
public class StudentController {

	@RequestMapping("/")
    public List<Student> getEmployees() 
    {
      List<Student> employeesList = new ArrayList<Student>();
      employeesList.add(new Student(1,"muhammad","ali","malikiyani4@gmail.com"));
      return employeesList;
      
    }
}
