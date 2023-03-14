package com.AspireDigital.AspireDigital.Position_Emp_Id;

import com.AspireDigital.AspireDigital.Employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PositionEmpIdController {

    @Autowired
    private final PositionEmpIdRepository repo;

    PositionEmpIdController(PositionEmpIdRepository repo) {this.repo = repo;}

    @GetMapping("/position/empid")
    public List<PositionEmpId> getPositionEmpId(@RequestParam Integer employee_id) {
        return this.repo.findAllById(employee_id);}
}
