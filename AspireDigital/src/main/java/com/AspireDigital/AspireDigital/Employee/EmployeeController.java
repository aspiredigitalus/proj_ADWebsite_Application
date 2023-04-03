package com.AspireDigital.AspireDigital.Employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private final EmployeeRepository repo;

    //constructor
    EmployeeController(EmployeeRepository repo) { this.repo = repo; }

    @GetMapping
    public Optional<Employee> getEmployee(@RequestParam Integer employee_id){
        return repo.findById(employee_id);
    }

    @GetMapping("/region")
    public List<Employee> getEmployeesByRegion(@RequestParam String region){
        return repo.getEmployeesByRegion(region);
    }

    @GetMapping("/all")
    public List<Employee> getEmployees(){return repo.findAll();}

    @PostMapping
    public Employee addEmployee(
            @RequestParam String fname,
            @RequestParam(required = false) String mInit,
            @RequestParam String lName,
            @RequestParam String region,
            @RequestParam(required = false) String profileLoc,
            @RequestParam(required = false) String linkedIn) {

        Employee employee = new Employee();

        employee.setFirstName(fname);
        employee.setMiddleInit(mInit);
        employee.setLastName(lName);
        employee.setRegion(region);
        employee.setProfileLoc(profileLoc);
        employee.setLinkedIn(linkedIn);

        return repo.save(employee);
    }
}
