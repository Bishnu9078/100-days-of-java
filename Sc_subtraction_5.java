import java.util.Scanner;
public class Sc_subtraction_5{

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b= sc.nextInt();

        int difference= a-b;

        System.out.println("The difference between first and second number is:" + difference);
    }
    
}
