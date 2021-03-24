//https://www.hackerrank.com/challenges/2d-array/problem?h_r=profile

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class hourglass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxsum[] = new int[16];
        int ms = 0;
        int ik = 0;

        while(ik<=3){
            int jk=0;
            while(jk<=3){
            int sum=0;
            int c = 0;
            for (int i = 0+ik;i<=2+ik;i++)
            {                
                    for(int j=0+jk;j<=2+jk;j++)
                    {   
                        c++;
                        if(!(c==4 || c==6))      
                            sum+=arr[i][j];               
                    }              
            }
        int max = maxsum[0];
        for (int i = 1; i < maxsum.length; i++)
            if (maxsum[i] > max)
                max = maxsum[i];

        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
                { 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };

        int result = hourglassSum(arr);

        System.out.println(result);

        // scanner.close();
    }
}
