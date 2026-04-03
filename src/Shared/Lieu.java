package Shared;

import Equipement.Equipement;

import java.util.LinkedList;

public abstract class Lieu {

    private LinkedList<Piece> pieces;

    public void ajouterPiece(Piece piece){
        this.pieces.add(piece);
    }

    public LinkedList<Piece> getPieces() {
        return pieces;
    }
}
