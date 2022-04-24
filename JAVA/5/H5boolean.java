import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class H5boolean {
    public static Random r = new Random();
    public static Scanner s = new Scanner( System.in );
    public static boolean [] seats = new boolean [10];
    public static int assignedFirst = 0, assignedEco = 0;

    public static void main( String [] args ){
        book();
    }

    public static void book(){
        if( assignedFirst+assignedEco < 10 ){
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
            int f;
            do{
                f = r.nextInt(5);
            }while( seats[f] );
            seats[f]=true;
            assignedFirst += 1;
            System.out.printf("First class,\tseat #%d\n\n",f+1);
            book();
        }else if( assignedFirst==5 && assignedEco<5){
            System.out.println("\nFirst class is full, do you want to book Economy Class?");
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
    }
    public static void assignEco(){
        if( assignedEco < 5 ){
            int e;
            do{
                e = r.nextInt(5)+5;
            }while( seats[e] );
            seats[e]=true;
            assignedEco += 1;
            System.out.printf("Economy Class,\tseat #%d\n\n",e+1);
            book();
        }else if( assignedEco==5 && assignedFirst<5 ){
            System.out.println("\nEconomy class is full, do you want to book First Class?");
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
    }

}
