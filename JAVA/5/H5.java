import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class H5 {
    public static Random r = new Random();
    public static Scanner s = new Scanner( System.in );
    public static int [] seats = new int [10];
    public static int assignedFirst = 0, assignedEco = 0;

    public static void main( String [] args ){
        book();
    }

    public static void book(){
        boolean b = (assignedFirst+assignedEco!=10);
        if( b ){
            System.out.print( "Please type 1 for First Class\nPlease type 2 for Economy Class\nYour choose: " );
            int type = s.nextInt();
            if( type == 1 ){
                assignFirst();
            }else if( type == 2){
                assignEco();
            }else{
                System.out.println( "Please just type 1 or 2." );
                book();
            }
        }else{
            System.out.println( "The plane is now full" );
        }
        
    } 

    public static void assignFirst(){
        if( assignedFirst < 5 ){
            int f, location;
            Arrays.sort( seats );
            do{
                f = r.nextInt(5)+1;
                location = Arrays.binarySearch( seats, f );
            }while( location >= 0 );
            seats[0] = f;
            assignedFirst += 1;
            System.out.printf("First class,\tseat #%d\n\n",f);
        }else if( assignedFirst==5 && assignedEco<5){
            System.out.println("\nFirst class is full, if you want to book Economy Class?");
            System.out.print( "Please type 1 for Yes\nPlease type 2 for No\nYour choose: " );
            int type = s.nextInt();
            if( type == 1 ){
                assignEco();
            }else if( type == 2){
                System.out.println( "Next flight leaves in 3 hours." );
            }else{
                System.out.println( "Please just type 1 or 2." );
                assignFirst();
            }
        }
        book();
    }
    public static void assignEco(){
        if( assignedEco < 5 ){
            int e, location;
            Arrays.sort( seats );
            do{
                e = r.nextInt(5)+6;
                location = Arrays.binarySearch( seats, e );
            }while( location >= 0 );
            seats[0] = e;
            assignedEco += 1;
            System.out.printf("Economy Class,\tseat #%d\n\n",e);
        }else if( assignedEco==5 && assignedFirst<5 ){
            System.out.println("\nEconomy class is full, if you want to book First Class?");
            System.out.print( "Please type 1 for Yes\nPlease type 2 for No\nYour choose: " );
            int type = s.nextInt();
            if( type == 1 ){
                assignFirst();
            }else if( type == 2){
                System.out.println( "Next flight leaves in 3 hours." );
            }else{
                System.out.println( "Please just type 1 or 2." );
                assignEco();
            }
        }
        book();
    }

}
