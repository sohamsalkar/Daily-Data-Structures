//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=arcesium

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score < b.score)
            return 1;
        else if (a.score > b.score)
            return -1;
        else if (a.score == b.score) {
            int l1 = a.name.length();
            int l2 = b.name.length();
            int lmin = Math.min(l1, l2);
            int ret = 0;
            for (int i = 0; i < lmin; i++) {
                int flag = 1;
                int str1_ch = (int) a.name.charAt(i);
                int str2_ch = (int) b.name.charAt(i);
                if (str1_ch != str2_ch) {
                    ret = str1_ch - str2_ch;
                    flag = 0;
                    break;
                }
                if (flag == 1) {
                    if (l1 > l2) {
                        ret = 1;
                    } else
                        ret = -1;
                }
            }
            if (ret < 0)
                return -1;
            else
                return 1;
        } else
            return 0;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}