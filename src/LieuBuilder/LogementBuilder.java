package LieuBuilder;

import Equipement.Equipement;
import Shared.Enum.TypePiece;
import Shared.Interface.IBuilder;
import Shared.Lieu;
import Shared.Piece;

public class LogementBuilder implements IBuilder {

    private Logement logement;

    @Override
    public void reset() {
        this.logement = new Logement();
    }

    @Override
    public void ajoutPiece(TypePiece type, String nom) {
        this.logement.ajouterPiece(type, new Piece(nom));
    }

    @Override
    public void ajoutEquipement(Equipement equipement, Piece piece) {
        piece.ajouterEquipement(equipement);
    }

    @Override
    public Lieu getLieu() {
        return this.logement;
    }
}
