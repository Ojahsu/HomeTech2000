package LieuBuilder;

import Shared.Interface.IBuilder;

public class Directeur {

    private IBuilder builder;

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
        this.builder.ajoutPiece("Salon");
    }
}
