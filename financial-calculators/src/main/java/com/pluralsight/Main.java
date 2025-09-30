package com.pluralsight;
import java.util.Scanner;
//                      Workshop 1: Financial Calculators

public class Main {
    public static void main(String[] args) {

        Scanner myLoan_Advisor = new Scanner(System.in);

/*
 Step 1: Create a mortgage calculator that calculates how much a monthly payment for a loan would be.
 As well how much interest you would pay over the life of the loan.
 a.) It would accept the principal, interest rate, and loan length from user
 b.) It would display the expected monthly payment and total interest paid
 Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/ mo payment with a total interest of
 $36,115.99.
 This is calculator uses a compounded interest formula:
 M = P x (i * (1 + i)^n / ( (1 + i)^n ) - 1)
 */

        System.out.print("Enter the requested loan amount: $");
        double Principal = myLoan_Advisor.nextDouble();

        System.out.print("Enter your annual interest rate (ex. 7.625 for 7.625%): ");
        double annualRate = myLoan_Advisor.nextDouble() /100;

        System.out.print("Enter loan term (in years): ");
        int years = myLoan_Advisor.nextInt();

        int totalMonths_ofLoan = years * 12;
        double monthlyRate = annualRate/ 12;

        double totalOf_monthlyPayments = Principal * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths_ofLoan)) / (Math.pow(1 + monthlyRate,totalMonths_ofLoan) - 1);

        double totalInterest = (totalOf_monthlyPayments * totalMonths_ofLoan) - Principal;

        System.out.printf("A $%.2f loan at %.2f%% interest for %d years would have a $%.2f/mo payment with a total interest of $%.2f%n",
                Principal, annualRate * 100, years, totalOf_monthlyPayments, totalInterest);

    }
}