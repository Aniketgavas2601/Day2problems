//Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
package com.bridgelabz.day2problems;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
    int a,b,c;
    int fun1,fun2,fun3,fun4;
    //take input from users
        System.out.println("Enter first Number: ");
        Scanner num = new Scanner(System.in);           //object
        a=num.nextInt();
        System.out.println("Enter second Number: ");
        b=num.nextInt();
        System.out.println("Enter third Number: ");
        c=num.nextInt();

        fun1=a+b*c;                                        //stores the arithmetic operation in fun1
        fun2=c+a/b;                                        //stores the arithmetic operation in fun2
        fun3=a%b+c;                                        //stores the arithmetic operation in fun3
        fun4=a*b+c;                                        //stores the arithmetic operation in fun4


        //find the Maximum value from Arithmetic operation
        if(fun1 >= fun2 && fun1 >= fun3 && fun1 >= fun4){
            System.out.println("Maximum value is: "+fun1);
        }
        else if(fun2 >= fun1 && fun2 >= fun3 && fun2 >= fun4){
            System.out.println("Maximum value is: "+fun2);
        }
        else if(fun3 >= fun1 && fun3 >= fun2 && fun3 >= fun4){
            System.out.println("Maximum value is: "+fun3);
        }
        else{
            System.out.println("Maximum value is: "+fun4);
        }

        //find the Minimum value from Arithmetic operation
        if(fun1 <= fun2 && fun1 <= fun3 && fun1 <= fun4){
            System.out.println("Minimum value is: "+fun1);
        }
        else if(fun2 <= fun1 && fun2 <= fun3 && fun2 <= fun4){
            System.out.println("Minimum value is: "+fun2);
        }
        else if(fun3 <= fun1 && fun3 <= fun2 && fun3 <= fun4){
            System.out.println("Minimum value is: "+fun3);
        }
        else{
            System.out.println("Minimum value is: "+fun4);
        }
    }
}
