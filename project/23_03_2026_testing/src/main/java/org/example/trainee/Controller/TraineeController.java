package org.example.trainee.Controller;

import jakarta.validation.Valid;
import org.example.trainee.Entity.Trainee;
import org.example.trainee.Entity.TraineeDto;
import org.example.trainee.Service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TraineeController {
    @Autowired
private final ITraineeService traS;

    public TraineeController(ITraineeService traS) {
        this.traS = traS;
    }

    @GetMapping("/trainee")
    public List<TraineeDto> getAllTrainee() {
        return traS.getAllTrainee();
    }

@GetMapping("/trainee/{name}")
    public List<TraineeDto> getByName( @PathVariable String name) {
        return traS.getByName(name);
    }

    @GetMapping("/trainee/id/{id}")
    public TraineeDto getById(@PathVariable Integer id) {
        return traS.getById(id);
    }

@DeleteMapping("/trainee/{id}")
    public String deleteTrainee(Integer id) {
        return traS.deleteTrainee(id);
    }

@PutMapping("/trainee")
    public String updateTrainee(TraineeDto trainee) {
        return traS.updateTrainee(trainee);
    }

@PostMapping("/trainee")
    public String addTrainee( @Valid @RequestBody  TraineeDto trainee) {
        return traS.addTrainee(trainee);
    }
}
