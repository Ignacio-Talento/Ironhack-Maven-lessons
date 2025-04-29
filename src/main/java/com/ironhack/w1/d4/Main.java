package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Abstract classes & interfaces

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 2); // we cannot create an instance of an abstract class

        System.out.println("Web Player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 3);
        androidPlayer.play();
        androidPlayer.close();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        System.out.println(androidPlayer.getVolume());

        System.out.println(androidPlayer.share());

//        Big decimal (Java class)

        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("1.2385");
        BigDecimal bd2 = new BigDecimal("1.02346");
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));
        System.out.println(bd2.compareTo(bd1));
        System.out.println(bd1.compareTo(bd1));

        if (bd1.compareTo(bd2) > 0) {
            System.out.println("bd1 is greater than bd2");
        } else if (bd1.compareTo(bd2) < 0) {
            System.out.println("bd1 is not greater than bd2");
        } else if (bd1.compareTo(bd2) == 0){
            System.out.println("bd1 is equal to bd2");
        }

// CFU: Interfaces and Abstract Classes

        Account seller = new Account("John Smith", "123 Main St, Anytown", 001, 5000.00);
        Account buyer = new Account("Jane Doe", "456 Oak Ave, Someville",002, 3000.00);

        System.out.println("Initial account states:");
        System.out.println(seller);
        System.out.println(buyer);

        PaymentList paymentList = new PaymentList();

        Transaction transaction1 = new Transaction(
                seller.getAccountNumber(),
                buyer.getAccountNumber(),
                500.00,
                new Date(123, 0, 15)  // Jan 15, 2023
        );

        // Process the transaction (update account balances)
        seller.setBalance(seller.getBalance() + transaction1.getAmount());
        buyer.setBalance(buyer.getBalance() - transaction1.getAmount());

        // Add to payment list
        paymentList.addTransaction(transaction1);

        System.out.println("\nAfter first transaction:");
        System.out.println(seller);
        System.out.println(buyer);
        System.out.println("Transaction details: " + transaction1);

        // Create a second transaction a week later
        Transaction transaction2 = new Transaction(
                buyer.getAccountNumber(),
                seller.getAccountNumber(),
                200.00,
                new Date(123, 0, 22)  // Jan 22, 2023
        );

        // Process the transaction (update account balances)
        buyer.setBalance(buyer.getBalance() + transaction2.getAmount());
        seller.setBalance(seller.getBalance() - transaction2.getAmount());

        // Add to payment list
        paymentList.addTransaction(transaction2);

        System.out.println("\nAfter second transaction:");
        System.out.println(seller);
        System.out.println(buyer);

        // Demonstrate TransactionList methods
        System.out.println("\nDemonstrating TransactionList methods:");
        System.out.println("Last transaction: " + paymentList.getLastTransaction());

        Date searchDate = new Date(123, 0, 15);  // Jan 15, 2023
        System.out.println("Transaction on " + searchDate + ": " +
                paymentList.getTransactionByDate(searchDate));

        System.out.println("\nAll transactions:");
        ArrayList<Transaction> allTransactions = paymentList.getAllTransactions();
        for (Transaction t : allTransactions) {
            System.out.println(t);
        }

//        CFU: Big Decimal

        BigDecimal bd3 = new BigDecimal("1.3");
        BigDecimal bd4 = new BigDecimal("1.5");

        System.out.println(bd3.add(bd4));
        System.out.println(bd3.subtract(bd4));
        System.out.println(bd3.multiply(bd4));
        System.out.println(bd3.divide(bd4, 2, RoundingMode.HALF_EVEN));

        BigDecimal x = new BigDecimal("1.0");
        System.out.println(x.multiply(new BigDecimal("2.3")).add(new BigDecimal("1.5")).divide(x.subtract(new BigDecimal("0.8")), RoundingMode.HALF_EVEN));




    }
}
