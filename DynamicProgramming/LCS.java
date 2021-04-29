public class LCS {
    public static void main(String[] args) {
        String str1 = "xxxunixxxnixxquexxx";
        String str2 = "unique";
        System.out.println(lcs(str1, str2, (str1.length() - 1), (str2.length() - 1)));
        // System.out.println(str1.length() + " " + str2.length());
    }

    public static int lcs(String s1, String s2, int i, int j) {

        if (i < 0 || j < 0)
            return 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            // System.out.print(s1.charAt(i));
            return (1 + lcs(s1, s2, i - 1, j - 1));
        } else {
            return (Math.max(lcs(s1, s2, i, j - 1), lcs(s1, s2, i - 1, j)));
        }

    }

}
