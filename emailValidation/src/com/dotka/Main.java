package com.dotka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj email");
        String email = scanner.next();



        EmailValidation emailValidation = new EmailValidation();
        System.out.println(emailValidation.validateEmail(email));
    }
}
