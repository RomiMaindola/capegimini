package org.example.trainee.Service;

import org.example.trainee.Entity.Trainee;
import org.example.trainee.Entity.TraineeDto;

import java.util.List;

public interface ITraineeService {
    public List<TraineeDto> getAllTrainee();
    public List<TraineeDto> getByName(String name);
    public TraineeDto getById(int id);
    public String deleteTrainee(int id);
    public String updateTrainee(TraineeDto trainee);
    public String addTrainee(TraineeDto trainee);

}
