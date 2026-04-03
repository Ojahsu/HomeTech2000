package Equipement;

import Shared.Enum.Jours;
import Shared.Enum.TypeTache;
import Shared.Enum.StatutAspirateur;
import Shared.Piece;
import java.sql.Time;
import java.util.List;

public class RobotAspirateur extends Equipement implements Runnable {

    private StatutAspirateur statut;

    private float niveauEauPropre;

    private float niveauEauSale;

    private int nombreDeCycle;

    @Override
    public void run() {
    }

    public void lancerTache(TypeTache typeTache, List<Piece> pieces ){

    }

    public void retourStation(){
    }

    public void ajouterRoutine(Time heure, List<Jours> jour , TypeTache typeTache ){

    }
}
