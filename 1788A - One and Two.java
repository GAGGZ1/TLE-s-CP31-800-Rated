import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the size of the array
            int n = scanner.nextInt();
            
            // Initialize ArrayList to store indices of 2's
            ArrayList<Integer> twoIndices = new ArrayList<>();
            
            // Read the array and find the indices of 2's
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] == 2) {
                    twoIndices.add(j);
                }
            }
            // Count the number of 2's
            int countTwo = twoIndices.size();
            
            // If there are no 2's, return 0, or if count is odd, return -1
            if (countTwo == 0) {
                System.out.println("1");
            } else if (countTwo % 2 != 0) {
                System.out.println("-1");
            } else {
                // If count is even, we calculate the middle of the two 2's
                int middleIndex = twoIndices.get(countTwo / 2 - 1)+1; // Adjusted to get the middle element
                System.out.println(middleIndex);
            }
        }
        
        scanner.close();
    }
}
