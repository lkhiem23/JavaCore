/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo6;

import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class Demo6 {

    /**
     * @param args the command line arguments
     */
    
    public static long tinhGiaiThua(int n) {
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S = 0;
        for (int i = 1; i <= n; i++) {
            S += tinhGiaiThua(i);
        }
        System.out.println("Tong cac giai thua la: " + S);
    }
    

    
}
