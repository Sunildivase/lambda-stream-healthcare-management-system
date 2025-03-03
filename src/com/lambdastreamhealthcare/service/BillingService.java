package com.lambdastreamhealthcare.service;

import com.lambdastreamhealthcare.model.Billing;

import java.util.ArrayList;
import java.util.List;

public class BillingService {

    public List<Billing> createBill() {

        List<Billing> billings = new ArrayList<>();

        return List.of(new Billing(1, 200, 1500, 1),
                (new Billing(2, 300, 1700, 2)),
                (new Billing(3, 500, 5000, 3)),
                (new Billing(4, 300, 6455, 4)));

    }

    public void displayBill(){

        BillingService billingService = new BillingService();

        List<Billing> billings = billingService.createBill();

//                    List<Billing> billings = new ArrayList<>();

        List<Integer> billingList = billings.stream()
                .parallel()
                .filter(billing -> billing.totalBill() > 5000 && billing.bill() >=300)
                .map(billing -> billing.totalBill())
                .toList();

        System.out.println("billing list: "+billingList);
    }


}
