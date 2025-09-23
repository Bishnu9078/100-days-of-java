import java.util.Scanner;

public class PrimeInRange_28{

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter Starting number of range:");
        int start=sc.nextInt();

        System.out.println("Enter ending number of range:");
        int end=sc.nextInt();

        System.out.println("Prime numbers between "+start+" and "+end+" are:");

        for (int num= start; num <= end; num++){
            if(isPrime(num)){
                System.out.println(num +"");
            }
        }
    }

    //method to check prime
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i <= n/2 ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}