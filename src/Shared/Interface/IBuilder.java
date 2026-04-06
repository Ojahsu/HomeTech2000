package Shared.Interface;

import Equipement.Equipement;
import Shared.Enum.TypePiece;
import Shared.Lieu;
import Shared.Piece;

public interface IBuilder {
    void reset();
    void ajoutPiece(TypePiece type, String nom);
    void ajoutEquipement(Equipement equipement, Piece piece);
    Lieu getLieu();
}
