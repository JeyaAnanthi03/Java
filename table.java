import java.util.*;
public class table {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=20;i++){
            System.out.println(i+"*"+n+"=" +i*n);
        }
    }
}
