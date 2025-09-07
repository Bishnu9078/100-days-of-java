import java.util.Scanner;

public class Sc_IfElse_13 {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int a= sc.nextInt();
        
        System.out.println("Enter second number:");
        int b= sc.nextInt();

        if (a>b){
            System.out.println(" A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
    }
    
}
