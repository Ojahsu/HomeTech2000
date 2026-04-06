package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class Ampoule extends Equipement implements IMode, Runnable {

    public Mode mode = Mode.ACTIF;
    public float intencite;

    public void reglageIntencite(float intencite){}

    @Override
    public void changeMode() {
        switch (this.mode) {
            case ACTIF :
                this.mode = Mode.INACTIF;
            case INACTIF:
                this.mode = Mode.ACTIF;
        }
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= this.intencite) {
            System.out.println("Ampoule -> luminosite : " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            i++;
        }
        System.out.println(nom + " -> luminosite reglée a " + this.intencite);
    }
}
