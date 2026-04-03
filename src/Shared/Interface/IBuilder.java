package Shared.Interface;

import Equipement.Equipement;
import Shared.Piece;

public interface IBuilder {
    void reset();
    void ajoutPiece(String nom);
    void ajoutEquipement(Equipement equipement, Piece piece);
}
