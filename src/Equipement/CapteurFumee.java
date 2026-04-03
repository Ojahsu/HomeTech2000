package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class CapteurFumee extends Equipement implements IMode, Runnable {

    private Mode mode = Mode.ACTIF;
    private float batterie;

    public void alerteFumee() {}
    public void alerteBatterie() {}

    @Override
    public void changeModel() {}

    @Override
    public void run() {}
}
