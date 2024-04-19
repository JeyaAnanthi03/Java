import java.util.*;

public class checkPrime {
    public static void main(String args[]){
    System.out.println("Enter the number:");
    @SuppressWarnings("resource")
    Scanner sc  = new  Scanner(System.in);
    int n = sc.nextInt();
    int count =0;
    for(int i=2; i<n/2; i++){
    if(n%i == 0){
        System.out.println("The number is not a prime number");
        count++;
        break;
    }
   }
   if(count == 0){
    System.out.println("The number is  a prime number");
   }
    
}
}
