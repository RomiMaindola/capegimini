package org.example;

import Department_Employee.Department;
import Department_Employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

      EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      Department d = new Department("Marketing");
      List<Employee> li = new ArrayList<>();
      li.add(new Employee("raju","clerk"));
      li.add(new Employee("suresh","sub -clerk"));
      d.setEmployees(li);
      em.persist(d);
      em.getTransaction().commit();
      System.out.println("done -------------------------");

    }
}
