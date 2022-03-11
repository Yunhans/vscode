import java.util.Scanner;

public class Extra{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a,i=1;
        do{
            System.out.printf("Enter a positive integer: ");
            a = input.nextInt();
        }while(a<=0);
        System.out.println("number\tsquare\tcube");
        while(i<=a){
            System.out.printf("%d\t%d\t%d\n",i,i*i,i*i*i);
            i++;
        }
    }
}