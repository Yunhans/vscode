import java.util.Scanner;
public class TicSet{
    public Scanner input = new Scanner(System.in);

    private int [][] tic = new int [3][3];
    private int row, column, or, oc, xr, xc;
    

    public void setTicO(){
        System.out.print("Player O's turn\nPlayer O: Enter row(1, 2 or 3): ");
        or = input.nextInt();
        System.out.print("Player O: Enter column(1, 2 or 3): ");
        oc = input.nextInt();
        if(tic[or-1][oc-1] == 0){
            tic[or-1][oc-1] = 1;
        }else{
            System.out.println("There's already a sign.");
            setTicO();
        }
    }

    public void setTicX(){
        System.out.print("Player X's turn\nPlayer X: Enter row(1, 2 or 3): ");
        xr = input.nextInt();
        System.out.print("Player X: Enter column(1, 2 or 3): ");
        xc = input.nextInt();
        if(tic[xr-1][xc-1] == 0){
            tic[xr-1][xc-1] = 2;
        }else{
            System.out.println("There's already a sign.");
            setTicX();
        }
    }
    
    public String winner(){
        int x=0, o=0, r, c, d=0;
        for(r=0; r<3; r++){
            for(c=0; c<3; c++){
                if(tic[r][c]==1){ 
                    o++; 
                    d++;
                }
                if(tic[r][c]==2){ 
                    x++; 
                    d++;
                }
            }
            if(x==3){
                return "X";
            }else if(o==3){
                return "O";
            }
            x=0;
            o=0;
        }
        if(d==9){
            return "none";
        }
        for(c=0; c<3; c++){
            for(r=0; r<3; r++){
                if(tic[r][c]==1){ 
                    o++; 
                }
                if(tic[r][c]==2){ 
                    x++; 
                }
            }
            if(x==3){
                return "X";
            }else if(o==3){
                return "O";
            }
            x=0;
            o=0;
        }
        for(c=0; c<3; c++){
            for(r=0; r<3; r++){
                if(r+c==2 || r==c){
                    if(tic[r][c]==1){ 
                        o++; 
                    }
                    if(tic[r][c]==2){ 
                        x++; 
                    }
                }
            }
            
        }
        if(x==3){
            return "X";
        }else if(o==3){
            return "O";
        }
        return null;
    }

    public void gameBoard(){
        for( row=1; row<=13; row++ ){
            for( column=1; column<=31; column++ ){
                printBoard();
            }
            System.out.print( "\n" );
        }
            
    }

    public void printBoard(){
        if( row%4 == 1 ){
            System.out.print(column%10==1?" ":"-");
        }else if( row%4 == 2 || row%4 == 0 ){
            System.out.print(column%10==1?"|":" ");
        }else{
            if( column == 6 ){
                if( row == 3 ){
                    switch(tic[0][0]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 7 ){
                    switch(tic[1][0]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 11 ){
                    switch(tic[2][0]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }
            }else if( column == 16 ){
                if( row == 3 ){
                    switch(tic[0][1]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 7 ){
                    switch(tic[1][1]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 11 ){
                    switch(tic[2][1]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }
            }else if( column == 26 ){
                if( row == 3 ){
                    switch(tic[0][2]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 7 ){
                    switch(tic[1][2]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }else if( row == 11 ){
                    switch(tic[2][2]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                    }
                }
            }else{
                System.out.print(column%10==1?"|":" ");
            }
        }
    }

    public String toString(){
        return "Player "+winner()+" wins."+( winner().equals("none")? "\nIt's a draw." : "" );
    }

}
