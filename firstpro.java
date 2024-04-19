import java.util.Scanner;
class firstpro{
    public static void main (String args[])
    {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character: ");
            char n = sc.next().charAt(0);
            n=Character.toLowerCase(n);
   
                if(n == 'a'|| n== 'e'|| n == 'i'|| n== 'o'|| n =='u'){
                    System.out.println("vowel");
                }
                else{
                    System.out.println("consonant");
                }
        }
        
    }
