package com.sprngboot.h2db.example.sprngbooth2db;

import java.util.ArrayList;
import java.util.List;
import com.sprngboot.h2db.example.sprngbooth2db.repo.Employee;
import com.sprngboot.h2db.example.sprngbooth2db.repo.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository repository;


    public List<Employee> getAllEmployeeList(){
       final List<Employee> students = new ArrayList<>();

       for (Employee person : repository.findAll()) {
           System.err.println("Hello Here -----"+person.getFirstName());
        students.add(person);
       }
     return students;
    }

   
    public void save(final Employee employee) {
        repository.save(employee);
    }


   
   




}