import java.util.*;
public class primeNum {
    public static void main(String args[]){
        System.out.println("Enter the two numbers:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean flag = false;
        for(int i = n1; i<=n2; ++i){
            for(int j =2; j<= i/2;++j){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}
