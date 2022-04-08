import java.util.Scanner;

public class H2{
   public static void main( String [] args ){
      float value = 200, price = 0;

      Scanner input = new Scanner( System.in );
      
      System.out.printf( "%s\n   %s\n   %s\n",
                         "Enter the price of the items sold: ",
                         "On UNIX/Linux/MacOS type <Ctrl> d then press Enter",
                         "On Windows type <ctrl> z then press Enter" );
      
      while( input.hasNext() ){
         price += input.nextInt();
         value += price * 0.09;
      }
      
      System.out.printf( "The money you earned this month are %.2f $.", value );
   }
}