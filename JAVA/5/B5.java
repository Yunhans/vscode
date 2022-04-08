import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class B5{    
    public static void main(String[] args){
      int [] play = new int[6];
      int same = 0;
      String reward = "", l="", p="";
      for(int i=0; i<6; i++){ 
         play[i] = Integer.parseInt( JOptionPane.showInputDialog(null, "請投注第 " + (i+1) + " 個號碼<1至42>:") );
      }
      Arrays.sort(play);

      int [] lotto = draw(); //開出六個中獎號碼
      same = check(play, lotto);  //對獎
      System.out.println(same);
      switch(same){
         case 0:
         case 1:
         case 2:
            reward = "no price";
            break;
         case 3:
            reward = "4th price";
            break;
         case 4:
            reward = "3rd price";
            break;
         case 5:
            reward = "2nd price";
            break;
         case 6:
            reward = "1st price";
            break;
      }
      for(int i=0; i<lotto.length; i++){
         l += lotto[i];
         l += "  ";
         p += play[i];
         p += "  ";
      }
      JOptionPane.showMessageDialog(null, "中獎號碼為:" + l + "\n你的號碼為:" + p + "\n" + reward);
    }    

    public static int[] draw(){
       Random r = new Random();
       int [] lotto = new int[6];
       int temp = 0;

       for(int i=0; i<lotto.length; i++){
          do{
             temp = 1 + r.nextInt(9);
          }while( Arrays.binarySearch(lotto, temp)>=0 );
          lotto[0] = temp;
          Arrays.sort(lotto);
       }
      
       return lotto;
    }

    public static int check(int [] play, int [] lotto){
    //依需求實作出本方法y
       int counter = 0;
       for(int i=0; i<lotto.length; i++){
          if(Arrays.binarySearch(lotto, play[i])>=0){
             counter +=1;
          }
       }
       return counter;
    }
}