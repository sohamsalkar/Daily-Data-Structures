import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long x = s.nextLong();
        int[] a = new int[(int) n];
        for (int i = 0; i < (int) n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < (int) n; i++) {
            System.out.println(n + " " + x + " " + a[i]);
        }

    }

}