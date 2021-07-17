import java.util.*;
import java.lang.*;

public class String3 {
    public static void main(String[] args) {
        // take input n
        // take digits
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // get sum of vowels
        int sov = getVowels(nums, n);
        // pairs with target sov
        // System.out.println(sov);
        int ts = twosum(nums, sov);
        // print string
        String ans = getString(ts);

        System.out.println(ans);

    }

    static String getString(int num) {
        // num to string..
        String[] arr = new String[150];
        arr[0] = "zero";
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";
        arr[7] = "seven";
        arr[8] = "eight";
        arr[9] = "nine";
        arr[10] = "ten";
        arr[11] = "eleven";
        arr[12] = "twelve";
        arr[13] = "thirteen";
        arr[14] = "fourteen";
        arr[15] = "fifteen";
        arr[16] = "sixteen";
        arr[17] = "seventeen";
        arr[18] = "eighteen";
        arr[19] = "nineteen";
        arr[20] = "twenty";
        arr[30] = "thirty";
        arr[40] = "forty";
        arr[50] = "fifty";
        arr[60] = "sixty";
        arr[70] = "seventy";
        arr[80] = "eighty";
        arr[90] = "ninenty";
        arr[100] = "hundred";
        String s = "";
        if (num < 21 || num == 100)
            s = arr[num];
        else if (num > 20 && num < 99)
            s = arr[(num / 10) * 10] + "-" + arr[num % 10];
        else
            s = "X";
        return s;
    }

    static int twosum(int[] nums, int sov) {
        //

        int c = 0;
        Arrays.sort(nums);
        // 2 4 7 //
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int d = nums[i] + nums[j];
            if (d == sov) {
                c++;
                i++;
                j--;
            } else if (d < sov) {
                j--;
            } else
                i++;

        }

        return c;

    }

    static int getVowels(int[] nums, int n) {
        // return total vowels in all nums
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            sum = sum + vin(num);// add vowels in each num
        }
        return sum;
    }

    static int vin(int num) {
        // get num to string
        String s = getString(num);
        // get vowels and return
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                c++;
        }

        return c;

    }
}
