//https://www.hackerrank.com/contests/codevita-practice-round-2/challenges/shubham-vs-ujjwal-in-temple-run/copy-from/1335379543

import java.io.*;
import java.util.*;

public class ScoreTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = arr[i];
            } else
                sum[i] = sum[i - 1] + arr[i];

        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            int k = 0;
            boolean flag = true;
            while (c > sum[k]) {
                k++;
                if (k == n) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println(k + 1);
            } else
                System.out.println(-1);
        }

    }
}