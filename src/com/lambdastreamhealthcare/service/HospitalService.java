package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalService {

    private static Scanner scanner = new Scanner(System.in);

    List<Hospital> hospitals = new ArrayList<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        System.out.println("please enter email");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setAddress(address);
        hospital.setContactNo(Long.parseLong(contactNo));
        hospital.setEmailId(emailId);

        hospitals.add(hospital);
        return hospital;
    }
    public void displayHospital(){
        for(Hospital hospital: hospitals){
            System.out.println("hospitals: "+hospital);
        }
    }
    public void deleteHospital(int hospitalId){

        String removedHospital = String.valueOf(hospitals.remove(hospitalId));
        System.out.println("deleted hospital: "+removedHospital);
    }
}
