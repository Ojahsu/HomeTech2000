package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

import static Shared.Enum.Mode.ACTIF;


public class Alarme extends Equipement implements Runnable, IMode {

    public Mode mode = Mode.ACTIF;

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

        while (mode==ACTIF) {
            System.out.println("ALERTE : intrusion");
            try {
                Thread.sleep(5000); // Apparait toute les 5 secondes
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void sonne(){

    }

    public void armer(){

    }

    public void desarmer(){

    }

}
