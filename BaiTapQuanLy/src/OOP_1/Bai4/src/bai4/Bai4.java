/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai4;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Bai4 {
    int a;
    int b;
   
    
    public int getA() {
        return a;
    }
    
    public int getB() {
        return b;
    }
        
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int b = sc.nextInt();
    }

    int USCLN(int a, int b) {
        while (a != b) {
        
        if (a > b) {
        a = a - b;
        }
        else {
        b = b - a;
        }
    }
        return a;
 }
    int BSCNN(int a,int b){
        
        return a*b/USCLN(a, b);
      
 }

    public static void main(String[] args) {
        Bai4 bai = new Bai4();
        bai.nhap();
        System.out.println("UCLN:" + bai.USCLN(bai.getA(), bai.getB()));
        System.out.println("BCNN :" + bai.BSCNN(bai.getA(), bai.getB()));

    }
    
}


