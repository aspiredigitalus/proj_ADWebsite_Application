package com.AspireDigital.AspireDigital.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value="SELECT * FROM employee WHERE region= :region", nativeQuery = true)
    List<Employee> findByRegion(String region);

}
