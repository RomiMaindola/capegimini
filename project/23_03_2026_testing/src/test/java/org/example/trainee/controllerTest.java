package org.example.trainee;

import org.example.trainee.Entity.TraineeDto;
import org.example.trainee.Service.ITraineeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.bean.override.mockito.MockitoBeans;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class controllerTest {
    @Autowired
    public MockMvc mockMvc;


    @MockitoBean
    private ITraineeService service;

    @Test
    void getByIdTest() throws Exception{
        TraineeDto t1= new TraineeDto(2,"romi","java","noida");
        when(service.getById(2)).thenReturn(t1);
        mockMvc.perform(get("/trainee/id/2")).andExpect(status().isOk()).andExpect(jsonPath("$.name").value("romi"));

    }
    @Test
    void getTest() throws Exception{
        TraineeDto t1= new TraineeDto(2,"romi","java","noida");
        TraineeDto t2= new TraineeDto(3,"rohit","java","noida");
        when(service.getAllTrainee()).thenReturn(List.of(t1,t2));
        mockMvc.perform(get("/trainee")).andExpect(status().isOk()).andExpect(jsonPath("$[1].name").value("rohit"));

    }

    @Test
    void getByNameTest() throws Exception{
        TraineeDto t1= new TraineeDto(2,"romi","java","noida");

        when(service.getByName("romi")).thenReturn(List.of(t1));
        mockMvc.perform(get("/trainee/romi")).andExpect(status().isOk()).andExpect(jsonPath("$[1].name").value("romi"));
    }



}
