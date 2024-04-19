
import java.util.Scanner;
public class fibbinoci {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibbinoci series:  ");
        if(n==0 || n==1){
            System.out.println(1);
        }
        else {
            int a=1;
            int b=0;
           for(int i =0;i<n;i++){
               int c =a+b;

               a=b;
               b=c;

               System.out.print(c+" ");
           }
        }
    }
}
