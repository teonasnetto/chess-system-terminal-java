import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessmatch = new ChessMatch();

        while(true) {

            UI.printBoard(chessmatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition sourcePosition = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.print("Target: ");
            ChessPosition targetPosition = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessmatch.performChessMove(sourcePosition, targetPosition);
            
        }

    }
}