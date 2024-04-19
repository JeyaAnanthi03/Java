import java.util.*;
public class leapyr {
    public static void main(String args[]){
        System.out.println("Enter the year:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n%4==0)&&(n%100==0)){
            if(n % 400 == 0){
            System.out.println("leap year");
            }
            else {
                System.out.println(" Not a leap year");
            }
        }
        else {
            System.out.println(" Not a leap year");
        }
    }
}
