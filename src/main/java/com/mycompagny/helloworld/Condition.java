package com.mycompagny.helloworld;

public class Condition {
    public static void main(String... args){
        int annee=2002;
        int nbplan=9;
        if (annee>=2006){
            nbplan--;
        }
        System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d",annee,nbplan);
    }
}
