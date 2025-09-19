import java.util.Scanner;

public class ReverseNumber_24{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");  // User Input
        int num= sc.nextInt();

        int Original= num; //keeping copy of original number
        int Reversed=0;

        int temp=Math.abs(num); //taking absolute value of number (for negative numbers)

        while(temp !=0){
            int digit= temp %10;            // extracting last digit
            Reversed = Reversed * 10 + digit; // appending digit to reverse number
            temp= temp/10;               // removing last digit from original number    
        }

        if (Original <0){
            Reversed= -Reversed; // making reverse negative if original number was negative
        }

        System.out.println("Originl number:" + Original);
        System.out.println("Reversed number is:"+ Reversed);
    }
}