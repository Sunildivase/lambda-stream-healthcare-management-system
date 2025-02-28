package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Prescription;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrescriptionService {

    private static Scanner scanner = new Scanner(System.in);

    List<Prescription> prescriptions = new ArrayList<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription(){
        System.out.println("please enter prescriptionId");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);

        prescriptions.add(prescription);
        return prescription;
    }
    public void displayPrescription(){
        for(Prescription prescription: prescriptions){
            System.out.println("prescription: "+prescription);
        }
    }

    public void deletePrescription(int prescriptionId){
        Prescription removedPrescription = prescriptions.remove(prescriptionId);
        System.out.println("removed prescription: "+removedPrescription);
    }
}
