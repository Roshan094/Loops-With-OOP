/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.loopswithoop;

import java.util.Scanner;

public class LoopsWithOOP {

    private static double java, php, python, total, percentage;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LoopsWithOOP lp = new LoopsWithOOP();

        lp.getInput();
        lp.getTotal();

        if (java < 32 || php < 32 || python < 32) {
            System.out.println("Sorry Failed !!");
        } else {
            lp.getPercentage();
            lp.getDivision();
        }

    }

    public void getInput() {
        System.out.println("Enter the marks of JAVA ");
        java = input.nextDouble();
        System.out.println("Enter the marks of PHP");
        php = input.nextDouble();
        System.out.println("Enter the marks of PYTHON");
        python = input.nextDouble();
    }

    public void getTotal() {

        total = java + php + python;
        System.out.println("The total is " + total);

    }

    public void getPercentage() {
        percentage = total / 3;
        System.out.println("The percentage is " + percentage);
    }

    public void getDivision() {
        if (percentage >= 80 && percentage < 100) {
            System.out.println("Distinction (A+)");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("First Division (A)");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Second Division (B)");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Third Division (C)");
        }
    }

}
