import java.math.BigInteger;
import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take an input integer from user
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        // Calculate the factorial using BigInteger because we can calculate upto 100! by using BigInteger
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        // display the factorial of the number
        System.out.println("Factorial of " + num + " is: " + fact);

        // sum of factorial
        int sum = sumOfFactorial(fact);
        System.out.println("Sum of digits of factorial: " + sum);

    }
     // Method to calculate the sum of factorial
     public static int sumOfFactorial(BigInteger number) {
        int sum = 0;
        String numStr = number.toString();

        // coverting numbers into string representation
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }

}