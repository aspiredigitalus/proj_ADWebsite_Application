package com.AspireDigital.AspireDigital.PositionJoinVal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/position")
public class PositionJoinValController {
    @Autowired
    private final PositionJoinValRepository repo;

    //constructor
    PositionJoinValController(PositionJoinValRepository repo) { this.repo = repo; }
    @GetMapping
    public List<PositionJoinVal> getPositionsAndTitlesById(@RequestParam int employee_id) {
        return repo.findPositionAndName(employee_id);
    }
}
