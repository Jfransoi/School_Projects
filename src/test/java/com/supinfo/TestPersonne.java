package com.supinfo;



public class TestPersonne extends Personne{

    public static void main(String[] args) {

        // Declaration
            Personne UnePersonne = new Personne();

        // personne p ( Une personne)
        UnePersonne.setNom("Gomis");
        UnePersonne.setPrenom("Kevin");
        UnePersonne.setEmail("Kevin@gmail.com");
        UnePersonne.setAge(21);
        UnePersonne.setTel(781234567);

        // affichage
            Personne.afficher();
    }



}
