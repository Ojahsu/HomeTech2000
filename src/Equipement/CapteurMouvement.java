package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class CapteurMouvement extends Equipement implements IMode, Runnable {

    private Mode mode = Mode.ACTIF;
    public Mode getMode() {
        return mode;
    }
    public void alerteMouvement() {}

    @Override
    public void changeModel() {}

    @Override
    public void run() {}
}
