package Equipement;

import Shared.Enum.Jours;
import Shared.Enum.TypeTache;
import Shared.Enum.StatutAspirateur;
import Shared.Piece;
import java.sql.Time;
import java.util.List;

public class RobotAspirateur extends Equipement implements Runnable {

    public StatutAspirateur statut;

    public float niveauEauPropre;

    public float niveauEauSale;

    public int nombreDeCycle;

    public void setStatut(StatutAspirateur lStatut){
        this.statut = lStatut;

    }

    @Override
    public void run() {
        System.out.println(nom + " demarre...");
        this.statut = StatutAspirateur.EN_TACHE;
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println(nom + " -> nettoyage termine");
        this.statut = StatutAspirateur.EN_CHARGE;
    }


    public void lancerTache(TypeTache typeTache, List<Piece> pieces ){

    }

    public void retourStation(){
    }

    public void ajouterRoutine(Time heure, List<Jours> jour , TypeTache typeTache ){

    }
}
