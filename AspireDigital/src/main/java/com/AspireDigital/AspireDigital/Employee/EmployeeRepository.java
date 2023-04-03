package com.AspireDigital.AspireDigital.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//testing
    @Query(value="SELECT * FROM employee WHERE  active = 1 AND region= :region ORDER BY last_name asc", nativeQuery = true)
    List<Employee> getEmployeesByRegion(String region);

}
