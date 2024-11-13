import java.util.Scanner;

public class MenuCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of elements
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number :");
        double num2=sc.nextDouble();
        
        // Display menu
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice==5){
            System.out.println("Exits");
            
        }

        //perform the arithmetic operation
        if(choice==1){
            System.out.println(num1+num2);
        }else if(choice == 2) {
            System.out.println(num1-num2);
        }else if(choice == 3){
            System.out.println(num1*num2);
        }else if(choice ==4 ){
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }else{
            {
                System.out.println("Invalid choice");
            }
        }
}}
