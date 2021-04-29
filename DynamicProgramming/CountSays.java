import java.util.Scanner;

public class CountSays {

    public static String cAnds(int n) {
        String res = "1";

        while (n > 1) { // n=4 then res = 21
            int i = 0, j = 0;
            StringBuilder s = new StringBuilder(); // i= 0/1 ; j= 0/1/2
            for (i = 0, j = i; i < res.length(); i = j) { // i=0,j=0, 0 < 2 , i <- j

                while (j < res.length() && res.charAt(i) == res.charAt(j)) { // 0 < 2 and 2 == 2, 1<2 and 2==1 X , 1<2
                                                                             // and 1==1
                    j++;
                }
                s.append(j).append(res.charAt(i)); // 1221

            }
            res = s.toString();
            n--;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(cAnds(n));
    }
}
