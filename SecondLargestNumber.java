import java.util.Scanner;

public class SecondLargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Initialize array and take input
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
            int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
        
}
//methode for find second largest
public static int findSecondLargest(int[] numbers) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : numbers) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }
    return secondLargest;
}
}
