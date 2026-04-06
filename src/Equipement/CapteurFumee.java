package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class CapteurFumee extends Equipement implements IMode, Runnable {

    public Mode mode = Mode.ACTIF;
    public float batterie;

    public void alerteFumee() {}
    public void alerteBatterie() {}

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
