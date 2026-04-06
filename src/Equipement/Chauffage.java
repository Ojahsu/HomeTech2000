package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class Chauffage extends Equipement implements IMode, Runnable {

    public Mode mode = Mode.ACTIF;
    public float temperature;

    public void reglageTemperature( float temperatureCible){}
    public float getTemperaturePiece(){
        return 0;
    }

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
        int temp = 15;
        while (temp < temperature) {
            temp++;
            System.out.println("Temperature : " + temp + " C");
            try {
                Thread.sleep(1000); // monte d'1° par seconde
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

