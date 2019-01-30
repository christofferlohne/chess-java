public class ChessBoard {
    private int maxSizeBoard;
    private char[][] board;
    private char boardColor;


    public ChessBoard(int maxSizeBoard){
        this.maxSizeBoard = maxSizeBoard;
        this.board = new char[maxSizeBoard][maxSizeBoard];
        this.boardColor = 'w';
    };
    public void setMaxSizeBoard(int maxSizeBoard) {
        this.maxSizeBoard = maxSizeBoard;
    }
    private void boardColorToggle(){
        if(this.boardColor == 'w'){
            this.boardColor = 'b';
        }else{
            boardColor='w';
        }
    }
    public void initBoard(){
        for (int i=0; i < this.maxSizeBoard; i++){
            for (int j=0; j<this.maxSizeBoard; j++){
                board[i][j] = this.boardColor;
                boardColorToggle();
            }
            boardColorToggle();
        }
    }
    public void printBoard(){
        int a = 65;
        for (int i=0; i < this.maxSizeBoard+1; i++){
                for (int j = 0; j < this.maxSizeBoard; j++) {
                    if(i==maxSizeBoard) {
                        char b = (char) a;
                        System.out.print(b);
                        a++;
                    }else {
                        if(j==0){
                            System.out.print(maxSizeBoard-i);
                        }System.out.print(this.board[i][j]);}
                }
            System.out.println();
        }

    }



}

//