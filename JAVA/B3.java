import java.util.Scanner;

public class B3{
   public static void main( String [] args ){
      Scanner input = new Scanner(System.in);
      int row;
      System.out.print( "畫出邊長為a的正方形口字，a設為(輸入一個大於3的正整數): " );
      row = input.nextInt();

      for(int i=1; i<=row; i++){
         for(int j=1; j<=row; j++){
            System.out.print( j==1||j==row||i==1||i==row ? "口" : "  " );
         }
         System.out.println("");
      }
     
   }
}