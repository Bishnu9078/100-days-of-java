import java.util.Scanner;
public class SumOfN_21 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter  number:");
        int n= sc.nextInt();

        int sum=0;
        for(int i=0; i<=n; i++){
            sum += i;
            
        }
        System.out.println("The sum of first "+n+" natural number is: " +sum);
    }
}
