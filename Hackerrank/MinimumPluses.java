import java.io.*;
import java.util.*;
import java.lang.Math;

//1234=127
//1+234 //  234 = 127-1 | 126 X
//1+2+34  // 34 = 127 - (1+2) | 124 X
//1+2+3+4 // 4 = 127-(1+2+3) X
//12+34 // 34 = 127 - (12) | X
//12+3+4 // 4 = 127 - (3+4) X
//123+4 // 4 = 127 - ( 123) Y

// 1234 = 28
//1+23+4= 28
//1+234 // 234 = 28-1 | 27 // 2+34 , 2+3+4 , 23+4 

class MinimumPluses {
    static boolean flag = false;

    public static String kiti(String vals, int sum, String fs) // 1234 28 ""
    {
        System.out.println(vals);
        if (Integer.parseInt(vals.substring(0, 1)) + Integer.parseInt(vals.substring(1)) == sum) {
            fs = fs + vals.substring(0, 1) + "+" + vals.substring(1);
            flag = true;

            return fs;
        } else {
            fs = fs + vals.substring(0, 1) + "+";
            if (vals.substring(0, 1) != "")
                return (kiti(vals.substring(1), sum - Integer.parseInt(vals.substring(0, 1)), fs));
            else
                return ("");
        }

    }

    public static int minimum_pluses(String A) {

        String[] donn = A.split("=");
        String vals = donn[0];
        int sum = Integer.parseInt(donn[1]);
        String answer = kiti(vals, sum, "");
        System.out.println(answer);
        int count = 0;
        if (answer != "")
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == '+') {
                    count++;
                }
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A;
        A = scan.next();
        int result;
        result = minimum_pluses(A);

        if (result == 0)
            System.out.println("-1");
        else
            System.out.print(result);

    }
}