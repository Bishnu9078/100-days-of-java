import java.util.Scanner;
public class Sc_percentage_11 {
    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= (a*100)/ b;
        System.out.println("The percentage is:"+c);
    }
    
}
