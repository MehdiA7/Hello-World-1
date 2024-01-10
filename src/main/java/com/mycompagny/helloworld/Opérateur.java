package com.mycompagny.helloworld;

public class Opérateur {
    public static void main(String... args){
        int age=31;
        System.out.printf("J'ai %d ans et ",age);
        if (age<30){
            System.out.println("je suis assez jeune. ");
        }
        if (age>30){
            System.out.println("je veilli pas mal. ");
        }
    }
}
