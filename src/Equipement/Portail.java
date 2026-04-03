package Equipement;

import Shared.Enum.Etat;
import Shared.Interface.IEtat;

import java.util.LinkedList;
import java.util.List;

public class Portail extends Equipement implements IEtat, Runnable {

    private Etat etat = Etat.OUVERT;
    public Etat getEtat() {
        return etat;
    }
    private List portails = new LinkedList<>();


    @Override
    public void ouverture() {
        this.etat = Etat.OUVERT;
    }

    @Override
    public void fermeture() {
        this.etat = Etat.FERME;
    }

    @Override
    public void run() {

    }
}



