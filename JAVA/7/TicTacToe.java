public class TicTacToe {
    public static void main(String [] args){
        TicSet t = new TicSet();
        t.gameBoard();
        while( t.winner()==null ){
            t.setTicX();
            t.gameBoard();
            if(t.winner()!=null){
                break;
            }
            t.setTicO();
            t.gameBoard();
        }
        System.out.println(t);
        
    }
}
