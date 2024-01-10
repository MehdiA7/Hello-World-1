package com.mycompagny.helloworld;

public class lesNouvellePlanete {
    public static void main(String... args){
        String intro="En %d, les planètes du système solaire étaient au nombre de : %d";

        int nbPlanete;
        short annee=1850;

        if (annee<1600 || annee>2020) {
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d",annee);
        }
        else {
            if (annee<1700){
                nbPlanete=7;
            }
            else if (annee<1800){
                nbPlanete=8;
            }
            else if (annee<2006){
                nbPlanete=9;
            }
            else {
                nbPlanete=8;
            }
            System.out.printf(intro,annee,nbPlanete);

        }
    }
}
