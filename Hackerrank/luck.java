package Hackerrank;

//https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class luck {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] c) {
        int size = c.length;
        int luck = 0;
        ArrayList<Integer> imp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (c[i][1] != 1) {
                luck += c[i][0];
            } else {
                imp.add(c[i][0]);
            }
        }
        Collections.sort(imp, Collections.reverseOrder());
        for (int i = 0; i < imp.size(); i++) {
            if (i < k)
                luck += imp.get(i);
            else
                luck -= imp.get(i);
        }
        // System.out.println(size);
        return luck;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
