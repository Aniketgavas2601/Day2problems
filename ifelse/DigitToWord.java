package com.bridgelabz.day2problems;

import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {

        int a;
        System.out.println("Enter a Number: ");
        Scanner num = new Scanner(System.in);
        a=num.nextInt();

        if(a == 1){
            System.out.println("Unit");
        }
        else if(a == 10){
            System.out.println("Ten");
        }
        else if(a == 100){
            System.out.println("Hundred");
        }
        else if(a == 1000) {
            System.out.println("One Thosand");
        }
        else if(a == 10000) {
            System.out.println("Ten Thousand");
        }
        else if(a == 100000) {
            System.out.println("One lakhs");
        }
        else if(a == 1000000) {
            System.out.println("Ten lakhs");
        }
        else if(a == 10000000) {
            System.out.println("One Crore");
        }
        else{
            System.out.println("Error");
        }
    }
}
