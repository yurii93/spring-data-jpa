package com.yuravashchenko.spring.springboot.spring_data_jpa.repository;

import com.yuravashchenko.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
