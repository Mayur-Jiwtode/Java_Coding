package com.globallogic.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
