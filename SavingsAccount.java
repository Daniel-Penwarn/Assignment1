package Assignment1;

import java.util.*;

class SavingsAccount{
    static double annualInterestRate;

    private final int ACCOUNT_NUMBER;
    private double balance;

    public SavingsAccount(int ACCOUNT_NUMBER, double balance){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = balance;

    }
    public int getAccountNumber(){
        return this.ACCOUNT_NUMBER;
    }

    public void addMonthlyInterest(){
        double monthlyInterest = (this.balance * annualInterestRate) / 12;
        this.balance += monthlyInterest;
    }

    public static void setInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public double getBalance() {
        return this.balance;
    }
}


