package com.ironhack.w1.d4;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements ITransactionList {
    private ArrayList<Transaction> transactions;

    public PaymentList() {
        this.transactions = new ArrayList<>();
    }


    @Override
    public Transaction getLastTransaction() {
        if (transactions.isEmpty()) {
        return null;
    }
        return transactions.get(transactions.size() - 1); }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);

    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals(date)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
}
