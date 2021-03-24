package com.supinfo;

public class Personne {

    // Declaration
        private static String nom;
        private static String prenom;
        private static int age;
        private static int telephone;
        private static String email;


    // constructeurs
        public void personne (String nom, String prenom, int tel, String email, int age){
            Personne.nom=nom;
            Personne.prenom=prenom;
            Personne.telephone=tel;
            Personne.email=email;
            Personne.age=age;
        }
/*
        public Personne(String nom, String prenom, int tel){
            this.nom=nom;
            this.prenom=prenom;
            this.telephone=tel;
        }
*/
    // affichage 
        public static void afficher() {
            System.out.println("Nom :" + nom);
            System.out.println("Prenom :" + prenom);
            System.out.println("Email :" + email);
            System.out.println("Age :" + age);
            System.out.println("Telephone :" + telephone);
        }
        

    // getters 
    public String getNom() {
        return Personne.nom;
    }

    public String getPrenom() {
        return Personne.prenom;
    }

    public String getEmail() {
        return Personne.email;
    }

    public int getAge() {
        return Personne.age;
    }

    public int getTel() {
        return Personne.telephone;
    }



    // setters
        public void setNom(String nom) {
            Personne.nom = nom;
        }

        public void setPrenom(String prenom) {
            Personne.prenom = prenom;
        }

        public void setEmail(String email) {
            Personne.email = email;
        }

        public void setAge(int age) {
            Personne.age = age;
        }  

        public void setTel(int tel) {
            Personne.telephone = tel;
        }


}