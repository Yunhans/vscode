import java.util.Random;
public class EXE5_1{
   public static void main( String [] args ){
      Random r = new Random();
      int [] lotto = new int[6];
      for(int i=0; i<lotto.length; i++){
         lotto[i] = 1 + r.nextInt(42);
         System.out.printf("%02d  ", lotto[i]);
      }
   }
}