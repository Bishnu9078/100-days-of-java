import java.util.Scanner;
public class PalindromeNumber_25 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:"); // use input
        int num= sc.nextInt();

        String original= String.valueOf(num); // converting number to string
        String reversed = new StringBuilder(original).reverse().toString(); // Reverse String
        

        //palindrome check
        if(original.equals(reversed)){
            System.out.println(num + " is a palindrome number.");
        
        }else{
            System.out.println(num +" is not palindrome number.");
        }
    }
}
