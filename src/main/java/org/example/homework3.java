package org.example;

import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
//taskOne();
//taskTwo();
//taskThree();
//taskFour();
taskFive(3, 6);
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

    public static void taskThree(){
        System.out.println("TASK3");
        int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i < c.length; i++ ) {


            if (c[i] < 6) {
                c[i] = c[i] * 2;
                System.out.println(c[i]);
            }
        }

    }
    //не вышло с последним элементом
    public static void taskFour(){
        int [][] d = new int[7][7];
        d[0][0]= 1;

        for (int i = 0; i< d.length; i++) {
            for(int j = 0; j < d[i].length; j++) {
               int l = d[i].length;
                if (i == j ){
                    d[i+1][j+1]=1;
                }
                System.out.print(d[i][j] + "  " );
            }
            System.out.println();
        }

    }
    public static void taskFive(int len, int initialValue){
        int []f = new int [len];
        for (int i = 0; i < f.length;i ++){
            f[i]= initialValue;
            System.out.println(f[i]);
        }
        System.out.println();
    }
    public static void taskSix(){
        int []j = new int[5];
        final Random random = new Random();
        for( int i = 0; i < j.length; i ++){
            j[i]= random.nextInt(10);
        }

    }









}

