package com.sprngboot.h2db.example.sprngbooth2db;

import java.util.ArrayList;
import java.util.List;
import com.sprngboot.h2db.example.sprngbooth2db.repo.Employee;
import com.sprngboot.h2db.example.sprngbooth2db.repo.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    EmployeeService service;

   


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value= "/getall")
    public List<Employee> getAll() {
        return service.getAllEmployeeList();
    }


    

    @RequestMapping(path="/saveDataToDb/{name}/{designation}/{laststName}")
    public String saveHelloName(@PathVariable("name") String name,
                             @PathVariable("designation") String designation , @PathVariable("laststName") String laststName) {

                                Employee employee =new Employee( name, designation, laststName);
                                service.save(employee);
                               return "Saved to DB"+employee.getFirstName();
    }

    
  



}