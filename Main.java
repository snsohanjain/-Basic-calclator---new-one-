package com.codewithsohan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer :  ");
       int a = scanner.nextInt();
        System.out.print("Enter in between + - * / : ");
       char b = scanner.next().charAt(0);
        System.out.print("Enter an Integer : ");
       int c = scanner.nextInt();
       switch (b) {
           case '+':
               System.out.println(a + c);
               break;
           case '-':
               System.out.println(a - c);
               break;
           case '*':
               System.out.println(a * c);
               break;
           case '/':
               System.out.println(a / c);
               break;
           default: {
               System.out.println("Invalid Enter");

           }


       }

    }
}