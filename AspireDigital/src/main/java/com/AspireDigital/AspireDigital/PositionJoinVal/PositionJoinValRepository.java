package com.AspireDigital.AspireDigital.PositionJoinVal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PositionJoinValRepository extends JpaRepository<PositionJoinVal, Integer> {

    @Query(value="SELECT p.id, p.employee_id, p.position_id, v.position_title FROM position p JOIN position_val v ON p.position_id = v.position_id WHERE employee_id = :employee_id ORDER BY v.position_title asc", nativeQuery = true)
    List<PositionJoinVal> findPositionAndName(int employee_id);
}
