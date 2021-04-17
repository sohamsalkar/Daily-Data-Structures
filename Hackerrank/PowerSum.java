import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PowerSum {

    static int powerSum(int X, int N, int i) {
        if (X == 0) {
            return 0;
        }
        int rem = (int) (X - Math.pow(i, N));
        if (rem < 0) {
            return 0;
        }
        if (rem == 0) {
            return 1;
        } else {
            return (powerSum(rem, N, i + 1) + powerSum(X, N, i + 1));
        }

    }

    private static final Scanner scanner = new Scanner(System.in);
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N, 1);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
