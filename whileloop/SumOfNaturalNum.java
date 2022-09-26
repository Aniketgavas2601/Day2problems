package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int num,i=1,sum=0;
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        num=obj.nextInt();

        while(i <= num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of prime Numbers: "+sum);

    }
}
