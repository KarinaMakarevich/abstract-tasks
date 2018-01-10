package by.epam.makarevich;

import by.epam.makarevich.entity.Payment;

import java.math.BigDecimal;

public class Worker {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addPurchase(new BigDecimal(100), "T-shirt");
        payment.addPurchase(new BigDecimal(100), "T-shirt");
        payment.addPurchase(new BigDecimal(185.36), "Sweater");
        System.out.println(payment.getCommonMoneyCount());
    }
}
