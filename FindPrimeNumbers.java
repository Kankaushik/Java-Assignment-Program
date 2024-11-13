import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // declaring array to store
        int[] numbers=new int[10];

        //takes an integer input n from users
        System.out.println("Enter the 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // display prime number in array
        System.out.println("Numbers of prime in array are:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }}
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false; 
                }
            }
            return true; 
        
    
}}
