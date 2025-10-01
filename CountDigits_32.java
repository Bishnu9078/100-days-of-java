import java.util.Scanner;
public class CountDigits_32 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        //Userinput for a number
        System.out.println("Enter a number:");
        int num= sc.nextInt();

        int count =0; // to count digits
        int temp = num; // copy of number so that original number is not changed

        // loop until number becomes 0
        while(temp !=0){
            temp= temp/10;
            count++; // increment count for each digit
        }

        // special case for 0 
        if(num ==0){
            count =1;
        }

        System.out.println("Number of digits in " + num + " is: " + count);
        sc.close();

    }
    
}
