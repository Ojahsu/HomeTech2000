package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

import static Shared.Enum.Mode.ACTIF;


public class Alarme extends Equipement implements Runnable, IMode {

    private Mode mode;

    @Override
    public void changeModel() {

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
