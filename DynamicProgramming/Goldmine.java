import java.util.Scanner;
/*
      j  j  j  j
i    00 01 02 03
i    10 11 12 13 
i    20 21 22 23
i    30 31 32 33
*/

public class Goldmine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        for (int j = dp[0].length - 1; j >= 0; j--) {
            for (int i = dp.length - 1; i >= 0; i--) {
                if (j == m - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == n - 1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }
        int max = dp[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (dp[i][0] >= max)
                max = dp[i][0];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }

}
