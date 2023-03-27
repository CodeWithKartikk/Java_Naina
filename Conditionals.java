import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        System.out.print("Please Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Buzz Number Program
        // if(num % 10 == 7 || num % 7 == 0){
        //     System.out.println("Given Number is Buzz Number");
        // }else{
        //     System.out.println("Given Number is Not Buzz Num");
        // }

        // Pronic Number Program
        // 1. Check the no.(N) is Pronic or Not
        // 2. Calculate the root of N (int format = k)
        // 3. k*(k+1) == N
        int k = (int) Math.sqrt(num);
        int product = k*(k+1);
        if(product == num){
            System.out.println("Pronic Number");
        }else{
            System.out.println("Not A Pronic Number");
        }
    }
}