package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class CapteurMouvement extends Equipement implements IMode, Runnable {

    public Mode mode = Mode.ACTIF;

    public void alerteMouvement() {}

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
    public void run() {}
}
