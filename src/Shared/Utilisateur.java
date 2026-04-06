package Shared;

import java.util.LinkedList;

public class Utilisateur {

    public static int UsersID;

    public int id;
    public String nom;
    public String prenom;
    public String email;
    public LinkedList<Lieu> lieux;

    public Utilisateur(String nom, String prenom, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.lieux = new LinkedList<>();
    }
}
