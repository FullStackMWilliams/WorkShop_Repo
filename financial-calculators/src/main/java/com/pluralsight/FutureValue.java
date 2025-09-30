package com.pluralsight;
import java.util.Scanner;

//                         Workshop 1: part 2 Future Value

public class FutureValue {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

// Step 1: Create a calculator that determines the future value of a one-time deposit assuming compound interest
// This is used to help you calculate how much a CD will be worth when it matures
        // a.) It would accept the deposit, interest rate, and number of years from the user
        // b.) it would display the future value and the total interest earned
// Example: If you deposit $1,000 in a CD that earns 1.75% interest and matures in 5 years, your CD's ending balance will be $1,091.44 amd you would have earned $91.44 in interest
// Notes: The number above assume daily compounding
// Equation: FV = P x (1 + (r / 365) ) ^ (365 x t)

        System.out.println("Enter deposit amount: $");
        double principal = userInput.nextDouble();


        System.out.println("Enter annual interest: ");
        double annualInterest_rate = userInput.nextDouble()/100;

        System.out.println("Enter number of year: ");
        int years = userInput.nextInt();

        int daysPer_year = 365;
        int totalDays = years * daysPer_year;
        double dailyRate = annualInterest_rate/daysPer_year;

        double futureWorth = principal * Math.pow(1 + dailyRate,totalDays);

        double totalInterest_earned = futureWorth - principal;

        System.out.println("If you deposit $" + principal + " in a CD that earns " + annualInterest_rate + "% interest and matures in " + years + " years, your CD's ending balance will be $" + futureWorth + " and you would have earned $" + totalInterest_earned);


    }
}