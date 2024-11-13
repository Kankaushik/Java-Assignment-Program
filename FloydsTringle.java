import java.util.Scanner;

public class FloydsTringle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // take input from users
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        // intializing number
        int numbers=1;
        // first loop for number of rows
        for(int i=1;i<=n;i++){
            //second loop for number of columns
            for(int j=1;j<=i;j++){
                // displaying ascending order of numbers
                    System.out.print(numbers+" ");
                    numbers++;
                   }
                System.out.println();
            }
}}
