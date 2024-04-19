import java.util.*;
public class palindrome {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String n = sc.nextLine();
        String k = n.toLowerCase();
        String ch = "";
        int a = k.length();
        for(int i =0; i<a;i++){
            ch =ch+ k.charAt(i);   
        }
         if(k.equals(ch)){
            System.out.println("String is palindrome");
         }
         else{
            System.out.println("String is not palindrome");
         }
    }
}
