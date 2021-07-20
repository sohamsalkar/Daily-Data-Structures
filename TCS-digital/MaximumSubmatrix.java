
//https://prepinsta.com/tcs-digital/programming-questions/question-2/
import java.util.*;
import java.lang.*;

public class MaximumSubmatrix {
    public static void main(String[] args) {
        int mat[][] = { { 3, -4, 6, -5, 1 }, { 1, -2, 8, -4, -2 }, { 3, -8, 9, 3, 1 }, { -7, 3, 4, 2, 7 },
                { -3, 7, -5, 7, -6 } };
        int k = 3;

        maxS(mat, k);
    }

    public static void maxS(int mat[][], int k) {
        int n = mat.length;
        int size = n + 1 - k;
        int sum[][] = new int[size][size];
        int maxsum = Integer.MIN_VALUE;
        int mi = 0, mj = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int s = 0;
                for (int x1 = i; x1 < i + k; x1++) {
                    for (int x2 = j; x2 < j + k; x2++) {
                        s += mat[x1][x2];
                        sum[i][j] = s;
                        if (s > maxsum) {
                            maxsum = s;
                            mi = i;
                            mj = j;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = mi; i < mi + k; i++) {
            for (int j = mj; j < mj + k; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
