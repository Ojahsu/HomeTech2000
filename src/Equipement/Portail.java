package Equipement;

import Shared.Enum.Etat;
import Shared.Interface.IEtat;

public class Portail extends Equipement implements IEtat, Runnable {

    public Etat etat = Etat.OUVERT;

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
        if (etat == Etat.FERME) {
            System.out.println(nom + " en cours d ouverture...");
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            this.ouverture();
            System.out.println(nom + " -> ouvert");
        } else {
            System.out.println(nom + " en cours de fermeture...");
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            this.fermeture();
            System.out.println(nom + " -> ferme");
        }
    }
}



