package com.example.Spring_data_app.repo;

import com.example.Spring_data_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeRepo extends JpaRepository<Employee,Integer> {

}
