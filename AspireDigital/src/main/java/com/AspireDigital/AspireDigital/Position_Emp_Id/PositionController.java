package com.AspireDigital.AspireDigital.Position_Emp_Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PositionController {

    @Autowired
    private final PositionRepository repo;

    PositionController(PositionRepository repo) {this.repo = repo;}

    @GetMapping("/position/empid")
    public List<PositionTitle> getPositionEmpId(@RequestParam Integer employee_id) {
        return this.repo.findPositions(employee_id);}
}
