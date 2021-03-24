package com.supinfo;

public class Professeur extends Personne{

    // Declaration 

    public static String VolHorraire;

    public Professeur(String nom, String prenom, int tel, String email, int age){
        super.personne(nom, prenom, tel, email, age);
        Professeur.afficher();
        Professeur.VolHorraire = VolHorraire;
    }


}
