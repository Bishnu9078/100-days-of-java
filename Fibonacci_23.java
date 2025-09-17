import java.util.Scanner;
public class Fibonacci_23 {
    
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= sc.nextInt();

        int a=0, b=1;
        System.out.print("Fibonacci series up to " + num + " terms: ");

        for(int i=1; i<= num; i++){
            System.out.println(a+"");

            int next = a+b;
            a=b;
            b=next;
        }
    }
}
