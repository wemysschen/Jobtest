/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaJob.JD20180909;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            int[][] data = new int[n][3];
            for (int k = 0; k < n; k++) {
                String[] sinput = sc.nextLine().split(" ");
                data[k][0] = Integer.parseInt(sinput[0]);
                data[k][1] = Integer.parseInt(sinput[1]);
                data[k][2]= Integer.parseInt(sinput[2]);
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (data[j][0] > data[i][0] && data[j][1] > data[i][1] && data[j][2] > data[i][2]) {
                        result++;
                        break;

                    }
                }
            }
            System.out.println(result);
        }

    }

}
