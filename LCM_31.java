import java.util.Scanner;
public class LCM_31 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Userinput for two numbers
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2= sc.nextInt();

        int a= num1 , b= num2;

        //  Calculate GCD using Euclidean algorithm
        while(b !=0){
            int temp =b;
            b = a%b;
            a= temp;
        }

        int gcd = a;
        int lcm= (num1* num2)/gcd; //Formula to calculate LCM

        //Print result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: "+ gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
