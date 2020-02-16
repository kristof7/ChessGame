public class Game {

    public static void main(String[] args) {

        Rock whiteRockLeft = new Rock(1, 1);
        Position testPositionRock = new Position(1, 8);
        if (whiteRockLeft.isValidMove(testPositionRock)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("I can't do it");
        }

        Queen whiteQueen = new Queen(1, 3);
        Position testPositionQueen = new Position(1, 9);
        if (whiteQueen.isValidMove(testPositionQueen)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("I can't do it");
        }

    }

    Piece[][] board;

    // Constructor creates an empty board
    Game() {
        board = new Piece[8][8];
    }
}
