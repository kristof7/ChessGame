class Bishop extends Piece{

    public Bishop(int r, int c) {
        super(r, c);
    }

    boolean isValidMove(Position newPosition){
        if((Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)) && (newPosition.column<=8 && newPosition.row<=8)){
            return true;
        }
        else{
            return false;
        }
    }
}