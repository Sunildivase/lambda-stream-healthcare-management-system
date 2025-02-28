package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Doctor;


import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    public List<Doctor> createDoctor(){

        List<Doctor> doctors= new ArrayList<>();

        return List.of(new Doctor(1,"john","will",34,
                "male","9875462154","Orthopedic",5),
                (new Doctor(2,"sam","nail",29,
                        "female","9875462154","General",3)),
                (new Doctor(3,"kane","jacobs",38,
                        "male","9875462154","Neurologist",7)));
    }
}
