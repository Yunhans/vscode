import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.time.LocalDate;
import java.awt.Desktop;
import java.io.*;
import java.net.URI;

public class Special {
    public static void main( String [] args)throws Exception{
        LocalDate d = LocalDate.now();
        Desktop desk = Desktop.getDesktop();
        int value, control, month=d.getMonthValue(), day=d.getDayOfMonth();
        String name = null;
        
        do{

            do{
                control=0;
                value = JOptionPane.showConfirmDialog(null, "這是一個非常特別的程式\n需要正確的人在正確的時間才能打開\n禁止偷看程式碼喔\n這樣子秘密就藏不住啦  (◞‸◟)\n說了這麼多\n想知道自己是否就是那位神選之人嗎?\nヽ( ° ▽°)ﾉ ", "神秘的程式", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );

                if(value == JOptionPane.YES_OPTION){
                    control=1;
                    name = JOptionPane.showInputDialog(null, "果然人都經不起好奇呢\n╮(╯∀╰)╭\n那麼就先告訴我你的名字吧:", "好奇心會殺死貓嗎", JOptionPane.QUESTION_MESSAGE);
                }else if(value == JOptionPane.NO_OPTION){
                    control=1;
                    name = JOptionPane.showInputDialog(null, "∑(￣口￣;)\n你說你不想知道?\n你不想知道但我想知道啊\n( -`д´-)\n所以就告訴我你的名字吧:", "傻眼貓咪", JOptionPane.QUESTION_MESSAGE);
                }

            }while(name==null && control==1);

            if( name.equals("chygo") || name.equals("Chygo") || name.equals("燦錤") || name.equals("張燦錤") ){

                if( month==3 && day==19 ){
                    control=0;
                    desk.browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
                }else if( (month == 3 && day<19) || month<3 ){
                    control=1;
                    name=null;
                    JOptionPane.showMessageDialog(null, "看樣子正確的時辰尚未到來\n要不要明天再試試看?\n(´･ω･`)", "早起的蟲兒被鳥吃", JOptionPane.INFORMATION_MESSAGE);
                }else if( (month==3 && day>19) || month>3 ){
                    control=1;
                    name=null;
                    JOptionPane.showMessageDialog(null, "有些時候美好的事物錯過就不再了\n(´•︵•`)", "過了這個村就沒這個店了", JOptionPane.INFORMATION_MESSAGE);
                }

            }else if(name!=null){
                name=null;
                control=1;
                JOptionPane.showMessageDialog(null, "(╥﹏╥)\n看樣子你並非那位神選之人\n抑或是你不小心打錯了你的名字\n( •́ _ •̀)?", "出事了阿北", JOptionPane.ERROR_MESSAGE);
            }

        }while(control==1);

    } 
}
