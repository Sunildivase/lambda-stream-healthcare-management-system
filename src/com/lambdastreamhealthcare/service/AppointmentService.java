package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    private static Scanner scanner = new Scanner(System.in);

    List<Appointment> appointments = new ArrayList<>();

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){
        System.out.println("please enter appointment Id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospitalId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter deptId");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);

        appointments.add(appointment);
        return appointment;
    }
    public void displayAppointment(){
        for(Appointment appointment: appointments){
            System.out.println("appointments: "+appointment);
        }
    }
    public void deleteAppointment(int appointmentId){
        String removedAppointment = String.valueOf(appointments.remove(appointmentId));
        System.out.println("removed appointment: "+removedAppointment);
    }
}
