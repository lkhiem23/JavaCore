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
public class Product {
    private String tenHang;
    private String Nsx;
    private Float Giaban;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNsx() {
        return Nsx;
    }

    public void setNsx(String Nsx) {
        this.Nsx = Nsx;
    }

    public Float getGiaban() {
        return Giaban;
    }

    public void setGiaban(Float Giaban) {
        this.Giaban = Giaban;
    }

    public Product(String tenHang, String Nsx, float Giaban) {
        this.tenHang = tenHang;
        this.Nsx = Nsx;
        this.Giaban = Giaban;
    }
    
    public Product(){
        this.tenHang = "Hang 1";
        this.Giaban = (float)12312;
        this.Nsx = "Tung Can";
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang "); this.tenHang = sc.nextLine();
        System.out.println("Nhap nha san xuat "); this.Nsx = sc.nextLine();
        System.out.println("Nhap gia ban ");
        while (!sc.hasNextFloat()) {
            System.out.print("Gia ban phai la so, vui long nhap lai: ");
            sc.next();
        } this.Giaban = sc.nextFloat();
    }
    public void Show(){
        System.out.println("Hang "+this.tenHang);
        System.out.println("Nha san xuat "+this.Nsx);
        System.out.println("Gia ban "+this.Giaban);
    }
    
    public static void Sort(Product b[]){
        for (int i = 0; i < b.length-1; i++){
            for (int j = i+1; j < b.length; j++){
                if (b[i].Giaban < b[j].Giaban){
                    float temp = b[i].Giaban;
                    b[i].Giaban = b[j].Giaban;
                    b[j].Giaban = temp;
                    
                }
            }
        }
        
        System.out.println("Hang hoa sau khi sap xep la");
        for (Product product : b) {
            product.Show();
        }
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so mat hang: "); n = Integer.parseInt(sc.nextLine());
        Product[] pro = new Product[n];

        for (int i = 0; i < n; i++) {
            pro[i] = new Product();
            pro[i].Nhap();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hang hoa thu "+i);
            pro[i].Show();
        }
        
        Product.Sort(pro);
    }
}
