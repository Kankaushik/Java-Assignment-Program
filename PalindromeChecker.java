import java.util.Scanner;

public class PalindromeChecker {

     public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        //take input string from users
        System.out.println("Enter a String:");
        String str =sc.nextLine();
        //display the result
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        }
         
 // create the methode to check palindrome
        public static boolean isPalindrome(String str){
          String rev="";
          int length=str.length();

          for(int i=length-1;i>=0;i--)
            rev+=str.charAt(i);

            if(str.equals(rev))
            return true;

                        return false;
        }
    }

