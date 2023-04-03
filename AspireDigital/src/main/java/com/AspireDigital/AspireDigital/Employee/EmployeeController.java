package com.AspireDigital.AspireDigital.Employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private final EmployeeRepository repo;

    //constructor
    EmployeeController(EmployeeRepository repo) { this.repo = repo; }

    @GetMapping("/employee")
    public Optional<Employee> getEmployee(@RequestParam Integer employee_id){
        return repo.findById(employee_id);
    }
    @GetMapping("/employee/region")
    public List<Employee> getEmployeesByRegion(@RequestParam String region){
        return repo.getEmployeesByRegion(region);
    }

    @GetMapping("/employee/all")
    public List<Employee> getEmployees(){return repo.findAll();}

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {return (Employee) repo.save(employee);}
}
