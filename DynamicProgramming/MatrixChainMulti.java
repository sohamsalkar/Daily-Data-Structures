class MatrixChainMulti {

    public static void main(String args[]) {
        int n = 5;
        int p[] = { 5, 4, 6, 2, 7 };
        int m[][] = new int[5][5];
        int s[][] = new int[5][5];
        int j, min, q;
        for (int d = 1; d < n - 1; d++) {
            for (int i = 1; i < n - d; i++) {
                j = i + d;
                min = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < min) {
                        min = q;
                        s[i][j] = k;
                    }
                }
                m[i][j] = min;
            }
        }
        // final ans: System.out.println(m[1][n - 1]);
        // full matix print
        for (int i = 0; i < n; i++) {
            for (int h = 0; h < n; h++) {
                if (h < i)
                    System.out.print("\t");
                else
                    System.out.print("\t" + m[i][h]);
            }
            System.out.println();
        }
    }
}