import java.util.Arrays;
public class array {
    public static void main( String [] args ){
        int [] arr = new int [10];
        arr[7] = 3;
        arr[2] = 9;
        for(int arrs:arr){
            System.out.print(arrs+" ");
        }
        Arrays.sort(arr);
        System.out.print("\n");
        for(int arrs:arr){
            System.out.print(arrs+" ");
        }
    }
}
