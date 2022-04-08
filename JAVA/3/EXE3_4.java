import javax.swing.JOptionPane;
import java.util.Random;

public class EXE3_4{
   public static void main( String [] args ){
      Random r = new Random();
      int a=0, row, line;
      String input = JOptionPane.showInputDialog( null, "輸入一小於11大於1的正整數: ", "輸入", 1 );
      a = Integer.parseInt(input);
      String out = "";

      for( line = 1; line <= a; line++ ){
         for( row = 1; row <= a; row++ ){
            out +=  r.nextInt(a);
         }
         out += "\n";
      }
      
      JOptionPane.showMessageDialog( null, out );
   }
}