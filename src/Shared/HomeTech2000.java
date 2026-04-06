package Shared;

public class HomeTech2000 {

    private static HomeTech2000 instance;
    private Utilisateur utilisateur;

    public HomeTech2000(){
        this.utilisateur = new Utilisateur("Fabrice", "Boudo", "Fabride.boudo@hometech2000.com");
    }

    static void main() {
        System.out.println("----------------------------------------------");
        System.out.println("------ INITIALISATION : Builder de lieu ------");
        System.out.println("----------------------------------------------");


    }
}
