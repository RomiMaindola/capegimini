package org.example.trainee.DAO;

import org.example.trainee.Entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITraineeRepo extends JpaRepository<Trainee,Integer> {
    public List<Trainee> findByName(String name);
}
