package Shared;

import java.util.LinkedList;

public class Utilisateur {

    private static int UsersID;

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private LinkedList<Lieu> lieux;

    public Utilisateur(String nom, String prenom, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.lieux = new LinkedList<>();
    }
}
