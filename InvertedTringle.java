import java.util.Scanner;
public class InvertedTringle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // take input from user
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        //1st loop for number of rows
        for(int i=n;i>=1;--i){
            // 2nd loop for number of columns
        for(int j=i;j>=1;--j){
                // display the results
                System.out.print(j+" ");
               }
            System.out.println();
        }
        
}
}

