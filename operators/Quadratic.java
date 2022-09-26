package com.bridgelabz.day2problems;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a,b,c;
        float delta;

        //take values from users
        System.out.println("Enter first value: ");
        Scanner num = new Scanner(System.in);                  //object
        a=num.nextInt();

        System.out.println("Enter second value: ");
        b=num.nextInt();

        System.out.println("Enter third value: ");
        c=num.nextInt();

        //2 roots of the equation formula
        delta=b*b-4*a*c;
        System.out.println("2 Roots of equation values: "+delta);

        //Root 1 of x
        int Root1 = (int) ((-b + Math.sqrt(delta))/(2*a));
        //Root 2 of x
        int Root2 = (int) ((-b + Math.sqrt(delta))/(2*a));

        System.out.println("Root 1 of x= "+Root1);
        System.out.println("Root 2 of x= "+Root2);


    }
}
