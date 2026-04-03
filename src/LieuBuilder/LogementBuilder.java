package LieuBuilder;

import Equipement.Equipement;
import Shared.Interface.IBuilder;
import Shared.Piece;

public class LogementBuilder implements IBuilder {

    private Logement logement;

    @Override
    public void reset() {
        this.logement = new Logement();
    }

    @Override
    public void ajoutPiece(String nom) {
        this.logement.ajouterPiece(new Piece(nom));
    }

    @Override
    public void ajoutEquipement(Equipement equipement, Piece piece) {
        piece.ajouterEquipement(equipement);
    }
}
