/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai6;

import java.util.Arrays;
import java.util.Scanner;


public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("So luong phan tu trong mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        
        System.out.println("Day sau khi sap xep: ");
        
        for (int num : a) {
            System.out.print(num + " ");
        }
        
        System.out.println();

        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Phan tu nho nhat: " + min);

        int sum = 0;
        int dem = 0;
        for (int num : a) {
            if (num % 3 == 0) {
                sum += num;
                dem++;
            }
        }
        if (dem > 0) {
            double tbc = (double) sum / dem;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + tbc);
        } else {
            System.out.println("Khong co phan tu chia het cho 3 trong mang. ");
        }
    }
    
}
