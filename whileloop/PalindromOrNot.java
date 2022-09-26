package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {
        int num,reverse=0,temp;
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        num= obj.nextInt();

        temp=num;
        while(num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
            if(temp == reverse){
                System.out.println("Enter number is palindrome");
            }
            else{
                System.out.println("Enter number is not an palindrome");
            }
    }
}
