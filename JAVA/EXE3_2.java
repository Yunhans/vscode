import java.util.Random;
import java.util.Scanner;

public class EXE3_2{
   public static void main( String [] args ){
      Random r = new Random();
      Scanner input = new Scanner(System.in);
      int reply, a, b, correct=0, counter=0;
      
      System.out.println( "Online test begins..." );

      do{
         a = r.nextInt(9) + 1;
         b = r.nextInt(9) + 1;

         System.out.printf( "%d x %d = ", a, b );
         reply = input.nextInt();

         if( reply == a*b ){
            correct++;
         }
	counter++;
      }while( counter <5 );

      System.out.println( correct >= 4 ? "Smart!" : "Keep practicing..." );
   }
}