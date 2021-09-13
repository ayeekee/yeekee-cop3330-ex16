package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is your age? ");
        String age = se.nextLine();
        int ageComp = Integer.parseInt(age);

        String msg = (ageComp >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(msg);
    }
}
