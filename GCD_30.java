import java.util.Scanner;
public class GCD_30 {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        //User input for two numbers
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2= sc.nextInt();

        // Finding out of GCD using Euclidean algorithm
        int a= num1;
        int b= num2;

        while (b!=0){
            int temp =b;
            b = a%b;
            a= temp;
        }

        System.out.println("The GCD of " +num1+ " and " +num2+ " is:" +a );
        sc.close();
    }
}
