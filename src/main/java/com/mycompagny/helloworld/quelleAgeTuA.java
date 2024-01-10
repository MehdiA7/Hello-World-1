package com.mycompagny.helloworld;

public class quelleAgeTuA {
    public static void main(String... args){

        String young="T'es encore un baby !";
        String old="Tu grandi vite !";
        String demiSiecle="Eh bah un demis siècle c'est pas rien !";

        int age=160;
        System.out.printf("Tu as %d ans ! ",age);

        if (age<=49 && age>=30) {
            System.out.println(old);
        }
        if (age>50){
            System.out.println(old);
        }
        if (age==50){
            System.out.println(demiSiecle);
        }
        if (age<30){
            System.out.println(young);
        }
        if (age>=150){
            System.out.printf("Heu attend ! J'ai des doutes sur le fait que tu sois en vie :/");
        }



    }
}
