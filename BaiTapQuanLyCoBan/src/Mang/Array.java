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
public class Array {
    public static void main(String[] args){
        int[] a = new int[30];
        float[] b = new float[20];
        String[] arr = {"Name1", "Name2", "Name3"};
        
        // Type number to array
//        int n;
        Scanner sc = new Scanner(System.in);
        //----------------------------Example 1--------------------------------
//        n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
        
        // Show the elements of array
//        for (int i = 0; i < n; i++){
//            System.out.print(a[i]);
//        }
        
        // Average of array
//        double aver = 0, sum = 0;
//        for (int i = 0; i < n; i++){
//            sum += a[i];
//        }
//        aver = (double) (sum/n);
//        System.out.println("Average "+aver);
//        
//        // Find the odd and even number 
//        for (int i = 0; i < n; i++){
//            if (a[i] % 2 == 0){
//                System.out.print("Even "+a[i]+"\t");
//            }
//        }
//        for (int i = 0; i < n; i++){
//            if (a[i]%2 != 0){
//                System.out.print("Odd "+a[i]+"\t");
//            }
//        }
        
        // --------------------------Example 2-----------------------
//        int m;
//        System.out.println("Nhap m"); m = sc.nextInt();
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextFloat();
//        }
//        for (int i = 0; i < m; i++){
//            System.out.println(b[i]);
//        }
//        float max;
//        for (int i = 1; i < m-1; i++){
//            for (int j = i+1; j < m; j++){
//                if (b[i] < b[j]){
//                  max = b[i];
//                  b[i] = b[j];
//                  b[j] = max;
//                }
//            }
//        }
//        for (int i = 0; i < m; i++){
//            System.out.println(b[i]);
//        }
        
        
        //--------------------------Example 3------------------------------
        
        String ar[] = new String[20];
        for (int i = 0; i < 5; i++){
            ar[i] = sc.nextLine();
        }
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
