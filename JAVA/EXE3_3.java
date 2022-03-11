import java.util.Scanner;

public class EXE3_3{
   public static void main( String [] args ){
      Scanner input = new Scanner(System.in);
      int row;
      System.out.print( "請問要印幾列的星星？" );
      row = input.nextInt();

      for(int i=1; i<=row; i++){
         for(int j=1; j<=i; j++){	
            System.out.print("*");
         }
         System.out.println("");
      }
     
   }
}