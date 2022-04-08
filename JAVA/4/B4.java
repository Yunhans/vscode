import javax.swing.JOptionPane;
import java.util.Random;

public class B4{
   public static void main( String [] args ){
      int value;
      String question = "開始玩水果拉霸";
      do{
         value = JOptionPane.showConfirmDialog(null, question, "選取一個選項", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         question = spin();
      }while(value == JOptionPane.YES_OPTION);
   }


   public static String spin(){
      String s="草莓  ", b="香蕉  ", out="";
      Random r = new Random();
      int f , cs=0, cb=0 ;

      for(int a=0; a<3 ; a++){
         f = r.nextInt(2);
         switch(f){
            case 0:
               out += s;
               cs++;
               break;
            case 1:
               out += b;
               cb++;
               break;
         }
      }
      
      if( cs ==3 || cb == 3){
         out += "\n中了！恭喜！繼續玩嗎？";
      }else{
         out += "\n銘謝惠顧  繼續玩嗎?";
      }

      return out;
   }
}

  
      