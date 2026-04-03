package Equipement;

import Shared.Enum.Etat;
import Shared.Interface.IEtat;

public class Volet extends Equipement implements IEtat, Runnable {
    private Etat etat = Etat.OUVERT;
    public Etat getEtat() {
        return etat;
    }
    private float ouverture ;


    @Override
    public void ouverture() {}

    @Override
    public void fermeture() {}

    @Override
    public void run() {}

}
