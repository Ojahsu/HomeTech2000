package Equipement;

import Shared.Enum.Mode;
import Shared.Interface.IMode;

public class Camera extends Equipement implements IMode, Runnable {
    private Mode mode = Mode.ACTIF;
    private boolean isModeNuit;

    public void alerteMouvement() {}
    public void getDirect() {}

    @Override
    public void changeModel() {}

    @Override
    public void run() {}
}
