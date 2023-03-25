package com.AspireDigital.AspireDigital.PositionJoinVal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PositionJoinValController {
    @Autowired
    private final PositionJoinValRepository repo;

    //constructor
    PositionJoinValController(PositionJoinValRepository repo) { this.repo = repo; }
    @GetMapping("/position")
    public List<PositionJoinVal> getPostionsAndTitlesById(@RequestParam int employee_id) {
        return repo.findPositionAndName(employee_id);
    }
}
