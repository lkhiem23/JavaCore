/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai7;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Cac phan tu la So Nguyen To: ");
        printPrimeNumbers(a);
        
        // b. In ra các phần tử là số hoàn hảo của mảng
        System.out.println("Cac phan tu la So Hoan Hao: ");
        printPerfectNumbers(a);
        
        // c. In ra các phần tử là số chẵn của mảng
        System.out.println("Cac phan tu la so chan:");
        printEvenNumbers(a);
        
        sc.close();
    }
    
    public static boolean snto(int m) {
        if (m <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Kiểm tra số hoàn hảo
    public static boolean shhao(int m) {
        int sum = 1;
        for (int i = 2; i * i <= m; i++) {
            if (m % i == 0) {
                sum += i;
                if (i != m / i) {
                    sum += m / i;
                }
            }
        }
        return sum == m;
    }

    public static void printPrimeNumbers(int[] arr) {
        for (int m : arr) {
            if (snto(m)) {
                System.out.print(m + " ");
            }
        }
        System.out.println();
    }
    
    // In ra các phần tử là số hoàn hảo của mảng
    public static void printPerfectNumbers(int[] arr) {
        for (int m : arr) {
            if (shhao(m)) {
                System.out.print(m + " ");
            }
        }
        System.out.println();
    }
    
    // In ra các phần tử là số chẵn của mảng
    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
}
