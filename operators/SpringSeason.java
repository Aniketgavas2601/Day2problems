package com.bridgelabz.day2problems;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int d,m;
        System.out.println("Enter a Day: ");
        Scanner sc = new Scanner(System.in);
        d=sc.nextInt();
        System.out.println("Enter a Month: ");
        m= sc.nextInt();

        // true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise
        if(d >= 20 && d<=31 && m == 3 || d >= 1 && d<=31 && m == 4 || d >= 1 && d <= 31 && m == 5 || d >= 1 && d <= 20 && m == 6){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
