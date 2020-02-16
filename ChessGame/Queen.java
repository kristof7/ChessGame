class Queen extends Piece {

    public Queen(int r, int c) {
        super(r, c);
    }

    boolean isValidMove(Position newPosition) {
        if ((Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row) || newPosition.column == this.column || newPosition.row == this.row) && (newPosition.column <= 8 && newPosition.row <= 8)) {
            return true;
        } else {
            return false;
        }
    }
}