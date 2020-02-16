class Rock extends Piece{

    public Rock(int r, int c) {
        super(r, c);
    }


    boolean isValidMove(Position newPosition){
        if((newPosition.column == this.column || newPosition.row == this.row) && (newPosition.column <=8 && newPosition.row <=8) ){
            return true;
        }
        else{
            return false;
        }
    }
}