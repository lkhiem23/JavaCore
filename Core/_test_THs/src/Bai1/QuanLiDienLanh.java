/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class QuanLiDienLanh {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tu lanh: ");
        int n = sc.nextInt();
        
        ArrayList<TuLanh> dstuLanh = new ArrayList<>();
        
        for(int i= 0; i<n; i++){
        TuLanh tuLanh = new TuLanh();
        tuLanh.nhap();
        dstuLanh.add(tuLanh);
    }
        for(TuLanh tuLanh : dstuLanh){
            tuLanh.hienthi();
        }
}
}