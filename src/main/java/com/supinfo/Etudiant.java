package com.supinfo;


public class Etudiant extends Personne{

    // Declaration
        public static String matricule;

        public Etudiant(String nom, String prenom, int tel, String email, int age){
            super.personne(nom, prenom, tel, email, age);
            Etudiant.afficher();
            Etudiant.matricule = matricule;
        }

}
