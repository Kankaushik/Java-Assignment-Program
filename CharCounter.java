import java.util.Scanner;

public class CharCounter {
     public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

        //take input string from users
        System.out.println("Enter a String:");
        String str =sc.nextLine();

        // Accept a character to search for
        System.out.print("Enter a character to check for: ");
        char checkChar = sc.next().charAt(0);

        // Count  the character in the string
        int count = countChar(str, checkChar);
        System.out.println("The character '" + checkChar + "' appears " + count + " time(s) in the string.");
}
//method for charecter count in string
public static int countChar(String str, char ch){
    int count = 0;
        for (int i = 0; i < str.length(); i++) 
            if (str.charAt(i) == ch) 
                count++;
            
                return count;

}}
