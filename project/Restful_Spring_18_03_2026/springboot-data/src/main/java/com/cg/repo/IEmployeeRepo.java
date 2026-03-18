package com.cg.repo;

import com.cg.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
    //no need to implement; springboot itself will implement

    //to find by non-primary key: write method as findBy+(property name should be same as in Employee)
    public List<Employee> findByName(String name);
    //or to change the method name like findByNa() then use:
    @Query("select e from Employee e where e.name=:n")
    public List<Employee> findByNa(@Param("n")String name);

    //to find employee having salary less than 40K
    public List<Employee> findBySalaryLessThan(double salary);

    //and condition:
    public List<Employee> findByNameAndSalaryLessThan(String name, double salary);

    //find by month:
    @Query("SELECT e FROM Employee e WHERE MONTH(e.dob) = :month")
    List<Employee> findByMonth(@Param("month") int month);
    //without query:
    public List<Employee> findByDobBetween(LocalDate start, LocalDate end);

}
