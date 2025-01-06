import java.util.Scanner;
 
public class TestCaseProcessor {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the number of test cases
        int t = scanner.nextInt();
 
 
        // Process test cases using a while loop
        while (t-- > 0) {
            // Read x and k for the current test case
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            if(x%k==0){
                System.out.println(2);
                System.out.println(x-1  + " "+ 1);
            }
            else{
                System.out.println(1);
                System.out.println(x);
            }
        }
 
        scanner.close();
    }
}
