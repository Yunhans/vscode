import java.util.Random;
import javax.swing.JOptionPane;
public class EXE5_2{
   public static void main( String [] args ){
      Random r = new Random();
      String [] student = {"a","b","c","d","e"};
      int reply = JOptionPane.showConfirmDialog(null, "開始點名");
      while(reply==0){
         int choose = r.nextInt(5);
         reply = JOptionPane.showConfirmDialog(null, "點到了" + student[choose] + "\n繼續點名");
      }
      
   }
}