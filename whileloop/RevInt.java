package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class RevInt {
    public static void main(String[] args) {
       int num,rev=0;
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        num=obj.nextInt();

        while(num != 0){
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num/10;

            remainder++;
        }
        System.out.println("Reverse of a Number: "+rev);
    }
}
