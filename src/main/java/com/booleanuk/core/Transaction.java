package com.booleanuk.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private Date date;
    private double credit;
    private double debit;
    private double balance;

    public Transaction(Date date, double credit, double debit, double balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public double getCredit() {
        return credit;
    }

    public double getDebit() {
        return debit;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date) + " || " + credit + " || " + debit + " || " + balance;
    }
}