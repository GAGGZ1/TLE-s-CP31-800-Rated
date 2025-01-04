import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Read the length of the sequence
            int n = sc.nextInt();

            // Read the sequence elements
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            ArrayList<Integer>arr=new ArrayList<>();
            arr.add(b[0]);
            for(int i=1;i<n;i++){
                if(b[i-1]>b[i]){
                    arr.add(b[i]);
                    arr.add(b[i]);
                }
                else{
                     arr.add(b[i]);
                     
                    
                }
            }
            processSequence(arr);
        }

        sc.close();
    }

    private static void processSequence(ArrayList<Integer> b) {
        // Placeholder for processing logic
        // Implement problem-specific operations here
        System.out.println(b.size());
        for (int i=0; i< b.size();i++) {
            System.out.print(b.get(i) + " "); // Example: Printing the sequence
        }
        
    }
}
