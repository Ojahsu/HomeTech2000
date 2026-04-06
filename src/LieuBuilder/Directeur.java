package LieuBuilder;

import Shared.Enum.TypePiece;
import Shared.Interface.IBuilder;

public class Directeur {

    public IBuilder builder;

    // Constructeur par défaut
    public Directeur() {
        this.builder = new LogementBuilder();
    }

    // Constructeur avec paramètre
    public Directeur(IBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(IBuilder builder){
        this.builder = builder;
    }

    public void makeStudio(){
        this.changeBuilder(new LogementBuilder());
        this.builder.reset();
        this.builder.ajoutPiece(TypePiece.SALON, "Salon");
        this.builder.ajoutPiece(TypePiece.SDB, "Salle de bain");
        this.builder.ajoutPiece(TypePiece.TOILETTE, "Toilette");
    }

    public void makeT2(){
        this.changeBuilder(new LogementBuilder());
        this.builder.reset();
        this.builder.ajoutPiece(TypePiece.SALON, "Salon");
        this.builder.ajoutPiece(TypePiece.SDB, "Salle de bain");
        this.builder.ajoutPiece(TypePiece.TOILETTE, "Toilette");
        this.builder.ajoutPiece(TypePiece.BUREAU, "Bureau");
        this.builder.ajoutPiece(TypePiece.CHAMBRE, "Chambre");
    }
}
