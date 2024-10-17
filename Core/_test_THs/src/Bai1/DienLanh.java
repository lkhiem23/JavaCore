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
public class DienLanh {
    protected String maHang;
    protected String tenHang;
    protected double donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        
    }
    
    public void hienthi(){
        System.out.println("Ma Hang: " + maHang);
        System.out.println("Ten Hang: " + tenHang);
        System.out.println("Don Gia: " + donGia);
    }
    }
    

