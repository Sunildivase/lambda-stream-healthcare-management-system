package com.lambdastreamhealthcare.model;

import java.util.Objects;

public record Billing(
        int billId,
        int bill,
        int totalBill,
        int personId) {


}
