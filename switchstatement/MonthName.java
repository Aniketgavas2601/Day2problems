package com.bridgelabz.day2Problems;


import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number between 1 to 12: ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();

        switch (num)
        {
            case 1:
                System.out.println("The enter number 1 month is January.");
                break;
            case 2:
                System.out.println("The enter number 2 month is February.");
                break;
            case 3:
                System.out.println("The enter number 3 month is March.");
                break;
            case 4:
                System.out.println("The enter number 4 month is Apil.");
                break;
            case 5:
                System.out.println("The enter number 5 month is May.");
                break;
            case 6:
                System.out.println("The enter number 6 month is June.");
                break;
            case 7:
                System.out.println("The enter number 7 month is July.");
                break;
            case 8:
                System.out.println("The enter number 8 month is August.");
                break;
            case 9:
                System.out.println("The enter number 9 month is September.");
                break;
            case 10:
                System.out.println("The enter number 10 month is October.");
                break;
            case 11:
                System.out.println("The enter number 11 month is November.");
                break;
            case 12:
                System.out.println("The enter number 12 month is December.");
                break;
            default:
                System.out.println("The enter number is invalid.");
                break;
        }
    }
}


