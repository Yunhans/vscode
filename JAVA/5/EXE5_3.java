import java.util.Random;
import java.util.Arrays;

public class EXE5_3{
   public static void main( String [] args ){
      Random r = new Random();
      int [] lotto = new int[6];
      int temp = 0;

      for(int i=0; i<lotto.length; i++){
         do{
            temp = 1 + r.nextInt(42);
         }while( Arrays.binarySearch(lotto, temp)>=0 );
         lotto[0] = temp;
         Arrays.sort(lotto);
      }
      
      for(int i=0; i<lotto.length; i++){
         System.out.printf("%02d  ", lotto[i]); 
      }

   }
}