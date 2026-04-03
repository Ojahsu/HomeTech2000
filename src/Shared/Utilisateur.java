package Shared;

import java.util.LinkedList;

public class Utilisateur {

    private static int UsersID;

    private int id;
    private String pseudo;
    private String email;
    private LinkedList<Lieu> lieux;

    public Utilisateur(String pseudo, String email){
        this.pseudo = pseudo;
        this.email = email;
        this.lieux = new LinkedList<>();
    }
}
