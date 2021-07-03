import java.util.*;
import java.lang.*;

public class countConstruct {

    public static int howmany(String tar, String[] wor) {
        if (memo.containsKey(tar))
            return memo.get(tar);
        if (tar == "")
            return 1;

        int tc = 0;

        for (String w : wor) {
            if (tar.indexOf(w) == 0) {
                int baki = howmany(tar.substring(w.length()), wor);
                tc += baki;
            }
        }

        memo.put(tar, tc);
        return tc;
    }

    static Map<String, Integer> memo = new HashMap<>();
    final static String[] wor = { "a", "b", "c", "ab", "bc", "abc", "d", "cd" };

    public static void main(String[] args) {

        System.out.println(howmany("abcd", wor));
        System.out.println(memo);
    }

}