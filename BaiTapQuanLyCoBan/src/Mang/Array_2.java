/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class Array_2 {
    public static void main(String[] args) {
        int[] a = Input();
        
        System.out.println("Mảng vừa nhập:");
        Print(a);
        
        // Sort array
        Arrays.sort(a);
        System.out.println("\n Mảng sau khi sắp xếp: :");
        Print(a);
        
        //Search element from array
        int position = Arrays.binarySearch(a, 3);
        if (position < 0){
            System.out.println("\n Không tìm thấy!");
        }else{
            System.out.println("\nTim thay o vi tri "+position);
        }
        
//        Arrays.fill(a, 5);
//        System.out.println("Mang sau khi gan la");
//        Print(a);
        
        Max_value(a);
        System.out.println("Tong cac phan tu le "+Sum_odd(a));
    }
    
    public static int[] Input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void Max_value(int[] a){
        Arrays.sort(a);
        System.out.println("Max "+a[a.length-1]);
    }
    
    public static int Sum_odd(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]%2!=0){
                sum += a[i];
            }
        }
        return sum;
    }
    
    public static void Sum_odd_even(int[] a){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0){
                even += a[i];
            }
            else{
                odd += a[i];
            }
        }
        System.out.println("Tong so chan " + even);
        System.out.println("Tong so le " + odd);
    }
    
    public static void Sum(int[] a){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                sum1 += a[i];
            }else{
                sum2 += a[i];
            }
        }
        System.out.println("Tong so duong " + sum1);
        System.out.println("Tong so am" + sum2);
    }
}
