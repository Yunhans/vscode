import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Banking {
    public static ArrayList<Account> account = new ArrayList<Account>();
    public static void main(String [] args){
        menu();
    }

    public static void menu(){
        int choose;
        choose = Integer.parseInt( JOptionPane.showInputDialog( "Welcome to Java Bank! Select transactions:\n(1) Create an account\n(2) Operate an existing account\n(3) Exit application" ) );
        switch( choose ){
            case 1:
                assign();
                break;
            case 2:
                operate();
                break;
            case 3:
                menu();
                break;
        }
    }

    public static void assign(){
        String name = JOptionPane.showInputDialog( "Enter customer name:" );
        String account = JOptionPane.showInputDialog( "Assign account number:" );
        double deposit = Double.parseDouble( JOptionPane.showInputDialog( "Enter amount of deposit:" ) );
        account.add( new Account( name, account, deposit) );
    }

    public static void operate(){
        int a = account.get();
    }

}