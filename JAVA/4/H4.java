import javax.swing.JOptionPane;

public class H4{

   static String perfects = "";

   public static void main( String [] args ){
      int num;
      num = Integer.parseInt( JOptionPane.showInputDialog(null, "Please enter an integer") );
      for(int i=num; i>0; i--){
         if( isPerfect(i)==1 ){
            perfects += "\n";
            perfects += i;
         }
      }
      JOptionPane.showMessageDialog(null, perfects);
   }
   
   public static int isPerfect(int input){
      int perfect = 0;
      for(int i=1; perfect<input; i++){
         perfect += i;
      }
      if(perfect == input){
         return 1;
      }else{
         return 0;
      }
   }

}
      