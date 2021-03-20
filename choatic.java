https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int size = q.length;
        int bribe=0;
        int totalbribe=0;
        int flag=1;
        for (int i=0;i<size;i++)
        {
            for(int t=i+1;t<size;t++)
            {               
                if( q[i]>q[t] )
                {
                    bribe++;     
                    //System.out.println("br "+bribe+" qi "+q[i]+" qt "+q[t]);
                         
                }
            }
            if(bribe<3){
                totalbribe+=bribe;
                bribe=0;
            }else
            {
                flag=0;
                break;
                
            }
            
        }
        if(flag==1)
        {
            System.out.println(totalbribe);
        }else{
            System.out.println("Too chaotic");
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
