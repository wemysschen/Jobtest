/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaJob.JD20180909;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- != 0) {

            int b = sc.nextInt();

            int c = sc.nextInt();

            int[][] arr = new int[b + 1][b + 1];

            int row = 0;

            int wid = 0;

            int[] sum = new int[b + 1];

            for (int i = 0; i < c; i++) {

                row = sc.nextInt();

                wid = sc.nextInt();

                arr[row][wid] = 1;

                arr[wid][row] = 1;

                sum[row]++;

                sum[wid]++;

            }

            int t = 0;

            for (int i = 0; i < b - 1; i++) {

                int key = 0;

                for (int j = 1; j < b + 1; j++) {
                    if (sum[j] == i) {
                        key++;
                    }
                }

                if (key + i < b && key != 0) {
                    t++;

                    break;

                }

            }

            if (t == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }

}
