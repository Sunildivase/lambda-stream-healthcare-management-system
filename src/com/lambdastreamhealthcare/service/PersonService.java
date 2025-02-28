package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {


    private Scanner scanner = new Scanner(System.in);

    List<Person> persons = new ArrayList<>();

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson(){

        System.out.println("please enter person Id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter firstName");
        String firstName = scanner.nextLine();

        System.out.println("please enter lastName");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        Long contactNo = Long.parseLong(scanner.nextLine());

        System.out.println("please enter alternate mobile");
        Long alternateMobile = Long.parseLong(scanner.nextLine());

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(contactNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        persons.add(person);
        return person;
    }

    public void displayPerson(){
        for(Person person:persons){
            System.out.println("person: "+person);
        }

    }

    public void deletePerson(int personId){

        String deletedPerson= String.valueOf(persons.remove(personId));
        System.out.println("deleted person: "+deletedPerson);
    }
}
