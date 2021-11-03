package org.example;

import java.util.Scanner;

public class homework02 {

        public static void main(String[] args) {
            sumCheck(4, 99);
            taskTwo(-9);
            taskThree(0);
            taskFour( "venom2", 7);
            taskFive();
        }

        public static void sumCheck( int a, int n) {
            if(a+n >=10 && a +n <=20){
                System.out.println("true");

            }
            else {
                System.out.println("false");
            }
        }
        public static void taskTwo(int ko){
            if(ko>= 0){
                System.out.println("positive");
            }
            else {
                System.out.println("negative");
            }
        }
        public static void taskThree(int f){
            if (f>0){
                System.out.println("false");
            }
            else if(f<0){
                System.out.println("true");
            }
            else {
                System.out.println("f = 0");
            }
        }
        public static void taskFour(String h, int quantity){
            while (quantity > 0) {
                System.out.println(h);
                quantity = quantity-1;
            }

        }

        public static void taskFive (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("how many days in the current year?");
            int year = scanner.nextInt();
            switch (year){
                case 366:
                    System.out.println("true");
                    break;
                case 365:
                    System.out.println("false");
                    break;
            }
        }

    }


