package com.mycompagny.helloworld;

public class VraiFaux {
    public static void main(String... args){
        int age=25;
        int prof=26;

        System.out.println(age<=25 && prof>=age ?"En voilà une année avec un bonne équilibre !" : "L'année sera parsemée d'absence.");
    }
}
