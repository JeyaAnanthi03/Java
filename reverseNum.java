import java.util.*;
public class reverseNum {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int rem,newnum=0;
        while(num != 0){
            
            rem = num%10;
            newnum= newnum*10 + rem;
            num/=10;
        }
        System.out.println("reverseed number :"+ newnum);
    }
}
