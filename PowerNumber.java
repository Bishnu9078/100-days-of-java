import java.util.Scanner;
public class PowerNumber {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter base number:");
        int base= sc.nextInt();
        
        System.out.println("Enter exponent number:");
        int exponent = sc.nextInt();

        int result=1;
        for(int i=1; i<= exponent; i++){
            result *= base;
        }

        System.out.println("The result of " +base+ " raised to the power of "+exponent+ " is: "+result);
    }
}
