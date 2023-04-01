package com.example.optionaldemo.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.example.optionaldemo.dto.Employee;

@Repository
public interface OptionalRepository {
    
    Optional<Employee> findById(Integer id);
    Optional<Employee> findByEmpId(Integer id);
    Optional<Employee> findByEmployeeId(Integer id);
}
