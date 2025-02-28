package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Department;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService {
    private static Scanner scanner = new Scanner(System.in);

    List<Department> departments = new ArrayList<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public Department createDepartment(){
        System.out.println("please enter id");
        int deptId =Integer.parseInt(scanner.nextLine());

        System.out.println("please enter dept name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospitalId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);

        departments.add(department);
        return department;
    }

    public void displayDepartment(){
        for(Department department: departments){
            System.out.println("departments: "+department);
        }

    }
    public void deleteDepartment(int deptId){
        String removedDepartment = String.valueOf(departments.remove(deptId));
        System.out.println("removed department: "+removedDepartment);
    }
}
