package org.example;

public class homework3 {
    public static void main(String[] args) {
taskOne();
taskTwo();
    }
    public static void taskOne(){
        int [] a = {1,0,0,0,0,0,0,1};
        for (int i = 0; i < a.length; i++ ) {
            System.out.println("TASK1");
            System.out.println("before");
            System.out.println(a[i]);
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.println("after");
            System.out.println(a[i]);
        }
    }

    public static void taskTwo(){
        System.out.println("TASK2");

        int [] b = new int [100];
        for(int i = 0; i<b.length;i++){
            System.out.println(b[i]);
            if (i<b.length){
                b[i]=i + 1;
                System.out.println(b[i]);
            }

        }


    }









}

