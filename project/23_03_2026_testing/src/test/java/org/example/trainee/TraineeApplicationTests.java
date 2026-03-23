package org.example.trainee;

import org.example.trainee.DAO.ITraineeRepo;
import org.example.trainee.Entity.DriverConvertor;
import org.example.trainee.Entity.Trainee;
import org.example.trainee.Entity.TraineeDto;
import org.example.trainee.Exception.TraineeNotFoundException;
import org.example.trainee.Service.ITraineeService;
import org.example.trainee.Service.TraineeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TraineeApplicationTests {
   // dealing with real database and service dependent on repositiory

//    @Autowired
//    private ITraineeService service;
//    @Test
//    void testTraineeById(){  // testing with real database
//        assertNotNull(service.getById(23));
//        assertThrows(TraineeNotFoundException.class,()->service.getById(22));
//
 //    }


    @Mock
    private ITraineeRepo repo;
    @InjectMocks
    private TraineeService service;

    @Test
    void testTraineeById(){
        TraineeDto traineeDto = new TraineeDto(12,"rom","finance","noida");
        Trainee trainee = DriverConvertor.convertIntoTrainee(traineeDto);
        trainee.setId(traineeDto.getId());

        when(repo.findById(12)).thenReturn(Optional.of(trainee));

        TraineeDto result = service.getById(12);

        assertEquals(12, result.getId());
        assertEquals("rom", result.getName());
    }

    @Test
    void deleteTraineeTest(){
        TraineeDto traineeDto = new TraineeDto(12,"rom","finance","noida");
        Trainee trainee = DriverConvertor.convertIntoTrainee(traineeDto);
        trainee.setId(traineeDto.getId());
        when(repo.findById(12)).thenReturn(Optional.of(trainee));
//        TraineeDto result = service.getById(12);
        if(service.getById(12)!=null)
        assertEquals("deleted",service.deleteTrainee(12));
    }
    @Test
    void createTraietest(){
        TraineeDto traineeDto = new TraineeDto(12,"rom","finance","noida");
        Trainee trainee = DriverConvertor.convertIntoTrainee(traineeDto);
        trainee.setId(traineeDto.getId());
       when(repo.saveAndFlush(any(Trainee.class))).thenReturn(trainee);
       assertEquals("save",service.addTrainee(traineeDto));
    }

//    @Test
//    void updateTest(){
//     TraineeDto sto = new TraineeDto(12,"romi","java","noida");
//     Trainee tra = DriverConvertor.convertIntoTrainee(sto);
//     tra.setId(sto.getId());
//     when(repo.findById(12)).thenReturn(Optional.of(tra));
//     when(repo.findById(12)).thenReturn()
//
//    }

}
