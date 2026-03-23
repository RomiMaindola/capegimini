package org.example.trainee.Entity;

public class DriverConvertor {
    public static TraineeDto convertIntoTraineeDto(Trainee trainee){
        return new TraineeDto(trainee.getId(),trainee.getName(),trainee.getDomain(),trainee.getLocation());
    }

    public static Trainee convertIntoTrainee(TraineeDto trainee){
        Trainee t = new Trainee();


        t.setName(trainee.getName());
        t.setDomain(trainee.getDomain());
        t.setLocation(trainee.getLocation());

        return t;
    }

}
