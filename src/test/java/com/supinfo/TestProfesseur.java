package com.supinfo;

public class TestProfesseur extends Professeur {
    
    public TestProfesseur(String nom, String prenom, int tel, String email, int age) {
        super(nom, prenom, tel, email, age);
        Professeur.afficher();
        System.out.println("Volume Horraire :" + Professeur.VolHorraire);
    }
}
