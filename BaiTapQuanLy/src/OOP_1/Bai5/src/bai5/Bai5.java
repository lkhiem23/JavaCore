/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai5;
import java.util.Scanner;


public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x, flag = 1, loc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap tat ca cac phan tu: ");
        for (int i = 0; i < n; i++){
        a[i] = sc.nextInt();
}
        System.out.print("Nhap phan tu muon xoa:");
    
        x = sc.nextInt();
        for (int i = 0; i < n; i++){
            
            if(a[i] == x){
            flag =1;
            loc = i;
            break;
            }
            
            else{
            flag = 0;
            }
        }
            if(flag == 1){
                for(int i = loc+1; i < n; i++) {
                a[i-1] = a[i];
            }
            System.out.print("Sau khi xoa: ");
        
        for (int i = 0; i < n-2; i++){
            System.out.print(a[i]+", ");
        }
        
            System.out.print(a[n-2]);
        }
        else{
            System.out.println("Khong tim duoc phan tu. ");
        }
            System.out.println(" ");
    }
    
}
