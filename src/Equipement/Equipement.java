package Equipement;

public abstract class Equipement {
    private String nom;
    private boolean isConnected;

    public String getNom() {
        return nom;
    }

    private void setNom(String nouveanNom){
        this.nom = nom;
    }
}
