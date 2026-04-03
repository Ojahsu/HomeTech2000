package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class Ampoule extends Equipement implements IMode, Runnable {

    private Mode mode = Mode.ACTIF;
    private float intencite;

    public void reglageIntencite(float intencite){}

    @Override
    public void changeModel() {}

    @Override
    public void run() {
        int lumi = 0;
        while (lumi < intencite) {
            lumi++;
            System.out.println("Luminosité de l'ampoule: " + lumi);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
