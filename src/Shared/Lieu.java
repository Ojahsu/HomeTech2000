package Shared;

import Shared.Enum.TypePiece;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Lieu {

    public HashMap<TypePiece, LinkedList<Piece>> pieces;

    public Lieu() {
        this.pieces = new HashMap<>();
    }

    public void ajouterPiece(TypePiece type, Piece piece){
        this.pieces.computeIfAbsent(type, key -> new LinkedList<>()).add(piece);
    }

    public LinkedList<Piece> getPieces(TypePiece type) {
        return this.pieces.get(type);
    }
}
