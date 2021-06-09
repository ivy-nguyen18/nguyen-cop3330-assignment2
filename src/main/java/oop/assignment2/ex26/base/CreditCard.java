package oop.assignment2.ex26.base;

public class CreditCard {
    private double balance;
    private double apr;
    private double monthlyPayment;

    public CreditCard(double balance, double apr, double monthlyPayment){
        this.balance = balance;
        this.apr = apr;
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff(){
        double dailyRate = apr/365;
        return (int)Math.ceil((-(1.00 / 30) * (Math.log(1 + (balance / monthlyPayment) * (1 - Math.pow(1 + dailyRate, 30)) ) / Math.log(1 + dailyRate))));
    }
}
