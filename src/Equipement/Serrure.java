package Equipement;

import Shared.Enum.Etat;
import Shared.Interface.IEtat;

public class Serrure extends Equipement implements IEtat {

    private Etat etat = Etat.OUVERT;

    public Etat getEtat() {
        return etat;
    }

    @Override
    public void ouverture() {
        this.etat = Etat.OUVERT;
    }

    @Override
    public void fermeture() {
        this.etat = Etat.FERME;
    }
}
