package com.supinfo;

public class TestEtudiant extends Etudiant {

    public TestEtudiant(String nom, String prenom, int tel, String email, int age) {
        super(nom, prenom, tel, email, age);
        Etudiant.afficher();
        System.out.println("Matricule :" +Etudiant.matricule);
    }


}
