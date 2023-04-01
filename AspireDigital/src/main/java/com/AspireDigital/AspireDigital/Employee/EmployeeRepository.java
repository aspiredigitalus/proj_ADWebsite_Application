package com.AspireDigital.AspireDigital.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//testing
    @Query(value="SELECT * FROM employee WHERE region= :region AND active = 1 ORDER BY last_name asc", nativeQuery = true)
    List<Employee> findByRegion(String region);

}
