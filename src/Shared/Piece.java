package Shared;

import Equipement.Equipement;

import java.util.LinkedList;

public class Piece {

    public String nom;
    public LinkedList<Equipement> equipements;

    public Piece(String nom){
        this.nom = nom;
        this.equipements = new LinkedList<>();
    }

    public void ajouterEquipement(Equipement equipement){
        if (equipement != null) {
            this.equipements.add(equipement);
        }
    }
}
