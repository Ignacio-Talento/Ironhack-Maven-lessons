package com.ironhack.w1.d4;

import java.util.ArrayList;
import java.util.Date;

public interface ITransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(Date date);
    ArrayList <Transaction> getAllTransactions();

}
