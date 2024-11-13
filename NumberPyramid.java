import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // take input from users
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        // 1st loop for number of rows
        for(int i=1;i<=n;i++){
            //2nd loop for numbers of columns
        for(int j=1;j<=i;j++){
                // displaying results
                System.out.print(j+" ");
               }
            System.out.println();
        }
        
}
}
