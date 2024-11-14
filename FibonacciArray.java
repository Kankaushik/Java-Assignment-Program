

import java.util.Scanner;

public class FibonacciArray {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //takes an integer input n from users
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        // if the number is less than or equal
        if(n<=0){
            System.out.println("The given number is invalid");
        }
        //create an array for fibonacci sequence
        int[] fibonacci=new int[n];
        // 1st and 2nd terms of fibonacci series
        fibonacci[0] =0; fibonacci[1]=1;
        //displaying the sequence of fibonacci series

        System.out.println("Fibonacci series of the"+"\n"+n+"\n"+"terms:");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci[0] +",");
            int nextTerm=fibonacci[0]+fibonacci[1];
            fibonacci[0] = fibonacci[1];
            fibonacci[1] =nextTerm;

        }

}
}
