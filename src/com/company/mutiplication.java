package com.company;

import java.util.Scanner;

 class multiplication {

    public static void main(String[] args) {


        int a, b, c,d;

        System.out.println("Enter range of numbers to prnt their multiplication table:"  );

        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();


        for (c= a; c<=b; c++){

            System.out.println("Multiplication table of " + c);


            for (d = 1; d<= 12; d++){

                System.out.println(c+"*"+d+" = "+ (c*d));
            }
        }
    }




}
