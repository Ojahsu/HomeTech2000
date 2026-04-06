package LieuBuilder;

import Equipement.Equipement;
import Shared.Interface.IBuilder;
import Shared.Lieu;
import Shared.Piece;

public class BureauBuilder implements IBuilder {

    private Bureau bureau;

    @Override
    public void reset() {
        this.bureau = new Bureau();
    }

    @Override
    public void ajoutPiece(String nom) {
        this.bureau.ajouterPiece(new Piece(nom));
    }

    @Override
    public void ajoutEquipement(Equipement equipement, Piece piece) {
        piece.ajouterEquipement(equipement);
    }

    @Override
    public Lieu getLieu() {
        return this.bureau;
    }
}
