import java.util.*;
public class largeNum {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        if((a>b) && (a>c)) {
             System.out.println("Largest  Number:" + a);
        }
        else if((b>a) && (b>c)){
            System.out.println("Largest  Number:" + b);
        }
        else{
            System.out.println("Largest  Number:" + c);
        }
    }
}
