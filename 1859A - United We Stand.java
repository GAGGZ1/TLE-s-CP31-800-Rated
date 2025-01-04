import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();

        // Loop through each test case
        for (int i = 0; i < t; i++) {
            // Read the length of the array for the current test case
            int n = sc.nextInt();
            
            // Create an array to store the elements
            int[] a = new int[n];
            
            // Read the array elements
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            
            int idx = 0;
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            
            Arrays.sort(a);
            
            while (idx < n && a[idx] == a[0]) {
                b.add(a[idx]);
                idx++;
            }
            
            while (idx < n) {
                c.add(a[idx]);
                idx++;
            }
          
            if (c.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                
                // Change loop variable from 'i' to 'k' for the b array
                for (int k = 0; k < b.size(); k++) {
                    System.out.print(b.get(k) + " ");
                }
                System.out.println(); // Move to the next line
                
                // Change loop variable from 'i' to 'l' for the c array
                for (int l = 0; l < c.size(); l++) {
                    System.out.print(c.get(l) + " ");
                }
            }
        }
        
        sc.close();
    }
}
