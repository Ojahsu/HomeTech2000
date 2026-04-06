package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class Camera extends Equipement implements IMode, Runnable {
    public Mode mode = Mode.ACTIF;
    public boolean isModeNuit;

    public void alerteMouvement() {}
    public void getDirect() {}

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
