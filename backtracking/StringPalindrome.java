import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        findPermutations(str, 0, str.length() - 1);
    }

    private static void findPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                findPermutations(str, left + 1, right);
                str = swap(str, left, i);
            }
        }

    }

    private static String swap(String str, int left, int i) {
        char t;
        char[] charArr = str.toCharArray();
        t = charArr[left];
        charArr[left] = charArr[i];
        charArr[i] = t;
        return String.valueOf(charArr);
    }
}