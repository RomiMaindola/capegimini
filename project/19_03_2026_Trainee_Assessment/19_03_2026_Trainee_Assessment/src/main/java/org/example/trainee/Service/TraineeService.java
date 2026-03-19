package org.example.trainee.Service;

import org.example.trainee.DAO.ITraineeRepo;
import org.example.trainee.Entity.DriverConvertor;
import org.example.trainee.Entity.Trainee;
import org.example.trainee.Entity.TraineeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TraineeService implements ITraineeService {
    @Autowired
    private ITraineeRepo repo;

    @Override
    public List<TraineeDto> getAllTrainee() {
        List<Trainee> trainee = repo.findAll();
        List<TraineeDto> traineeDto = new ArrayList<>();
        trainee.forEach(tr -> traineeDto.add(DriverConvertor.convertIntoTraineeDto(tr)));
        return traineeDto;
    }

    @Override
    public List<TraineeDto> getByName(String name) {
            List<Trainee> trainee = repo.findByName(name);
            List<TraineeDto> traineeDto = new ArrayList<>();
            trainee.forEach(tr -> traineeDto.add(DriverConvertor.convertIntoTraineeDto(tr)));
            return traineeDto;

    }

    @Override
    public TraineeDto getById(int id) {
        Optional<Trainee> op = repo.findById(id);
        if (op.isPresent()) {
            Trainee trainee = op.get();
            return DriverConvertor.convertIntoTraineeDto(trainee);
        } else {
            return null;
        }
    }

    @Override
    public String deleteTrainee(int id) {
        if(getById(id)!=null){
            repo.deleteById(id);
            return "deleted........";
        }
        return "not trainee found";
    }

    @Override
    public String updateTrainee(TraineeDto trainee) {
        Optional<Trainee> op = repo.findById(trainee.getId());
        if(op.isPresent()){
            Trainee t= DriverConvertor.convertIntoTrainee(trainee);
            t.setId(trainee.getId());
            repo.saveAndFlush(t);
            return "updated.......";
        }
        return "not updated ";
    }

    @Override
    public String addTrainee(TraineeDto trainee) {
        Trainee traine1 = DriverConvertor.convertIntoTrainee(trainee);
        repo.saveAndFlush(traine1);
        return " save ..........";

    }
}