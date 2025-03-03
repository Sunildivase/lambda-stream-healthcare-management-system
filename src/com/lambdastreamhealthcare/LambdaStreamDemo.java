package com.lambdastreamhealthcare;

import com.lambdastreamhealthcare.model.Billing;
import com.lambdastreamhealthcare.model.Doctor;
import com.lambdastreamhealthcare.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaStreamDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int option=0;
        do{
            System.out.println("---------healthcare-management-system----------");
            System.out.println("1. create person");
            System.out.println("2. create doctor");
            System.out.println("3. create hospital");
            System.out.println("4. create department");
            System.out.println("5. create appointment");
            System.out.println("6. create prescription");
            System.out.println("7. create billing");
            System.out.println("please select the option");
            option = Integer.parseInt(scanner.nextLine());

            switch(option){
                case 1:
                    PersonService personService = new PersonService();
                    personService.createPerson();
                    personService.displayPerson();
                    System.out.println("person created successfully");
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
                    hospitalService.deleteHospital(1);
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    DepartmentService departmentService = new DepartmentService();
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
                    departmentService.deleteDepartment(1);
                    System.out.println("department created successfully");
                    break;

                case 5:
                    AppointmentService appointmentService = new AppointmentService();
                    appointmentService.createAppointment();
                    appointmentService.displayAppointment();
                    appointmentService.deleteAppointment(1);
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    PrescriptionService prescriptionService = new PrescriptionService();
                    prescriptionService.createPrescription();
                    prescriptionService.displayPrescription();
                    System.out.println("prescription created successfully");
                    break;

                case 7:
                    BillingService billingService = new BillingService();
                    billingService.createBill();
                    billingService.displayBill();
                    System.out.println("bill generated successfully");
                    break;

                default:
                    System.out.println("please enter valid option");
                    break;
            }
        }while(option!=0);{
            System.out.println("Thank you !!!");
        }

    }


}
