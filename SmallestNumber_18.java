import java.util.Scanner;
public class SmallestNumber_18 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number:");
        int a= sc.nextInt();

        System.out.println("Enter second number:");
        int b= sc.nextInt();

        System.out.println("Enter third number:");
        int c= sc.nextInt();    
        
        int smallest;

        if(a<b && a<c){
            smallest = a;
        }else if(b<a && b<c){
            smallest= b;
        }else{
            smallest= c;
        }
        System.out.println("The smallest number is"+ smallest);
    }
    
}

