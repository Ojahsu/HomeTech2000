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
        System.out.println("Demarrage du nettoyage...");
        for (int i = 10; i <= 100; i += 10) {
            try { Thread.sleep(150); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println("Nettoyage " + i + "% complete");
        }
        this.statut = StatutAspirateur.EN_CHARGE;
        System.out.println("Nettoyage termine -> retour a la base");
    }
}
