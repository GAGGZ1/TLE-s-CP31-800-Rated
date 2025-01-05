import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Logic based on c's value and comparison between a and b
            if (c % 2 == 0) {
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (b > a) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
