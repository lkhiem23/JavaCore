/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;

import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class Test {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hinh "); n = sc.nextInt();
        
        System.out.println("Nhap vao thong tin HCN");
        Rectangle[] r = new Rectangle[n];
        for (int i = 0; i < n; i++){
            r[i] = new Rectangle();
            r[i].input();
        }
        System.out.println("Thong tin HCN vua nhap");
        for (int i = 0; i < n; i++){
            r[i].show();
        }
    }
}
