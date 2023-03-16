package com.AspireDigital.AspireDigital.Position_Emp_Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface PositionRepository extends JpaRepository<PositionTitle, String> {
    @Query(value="SELECT * FROM position_title WHERE id= :id", nativeQuery = true)
    List<PositionTitle> findPositions(int id);
}
