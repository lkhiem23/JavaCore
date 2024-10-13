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
public class Product2 {
    private String maHH;
    private String tenHH;
    private float soluong;
    private float gia1sp;

    public Product2(String maHH, String tenHH, float soluong, float gia1sp) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soluong = soluong;
        this.gia1sp = gia1sp;
    }
    
    public Product2(){
        this.maHH = "Ma1";
        this.tenHH = "Hang1";
        this.soluong = 2;
        this.gia1sp = 123123;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    public float getGia1sp() {
        return gia1sp;
    }

    public void setGia1sp(float gia1sp) {
        this.gia1sp = gia1sp;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang "); this.maHH = sc.nextLine();
        System.out.println("Nhap ten hang "); this.tenHH = sc.nextLine();
        System.out.println("Nhap so luong ");
        while (!sc.hasNextFloat()) {
            System.out.print("So luong phai la so, vui long nhap lai: ");
            sc.next();
        } this.soluong = sc.nextFloat();
        System.out.println("Nhap gia ban cua 1 hang ");
        while (!sc.hasNextFloat()){
            System.out.println("Gia tren 1 san pham khong phai la so, vui long nhap lai");
        } this.gia1sp = sc.nextFloat();
    }
    
    public void Show(){
        System.out.println("Ma hang "+this.maHH);
        System.out.println("Ten hang "+this.tenHH);
        System.out.println("So luong "+this.soluong);
        System.out.println("Gia 1 san pham "+this.gia1sp);
    }
    
    public static void Sort(Product2[] pr){
        for (int i = 0; i < pr.length-1; i++){
            for (int j = i+1; j < pr.length; j++){
                if (pr[j].gia1sp > pr[i].gia1sp){
                     float temp = pr[i].gia1sp;
                     pr[i].gia1sp = pr[j].gia1sp;
                     pr[j].gia1sp = temp;
                }
            }
        }
        
        System.out.println("Hang hoa sau khi sap xep la");
        for (Product2 product2 : pr) {
            product2.Show();
        }
        System.out.println("");
        System.out.println("Hang co gia tri lon nhat la");pr[0].Show();
    }
    
    public static void Find(Product2[] pr){
        boolean check = true;
        for (Product2 pr2 : pr){
            if (pr2.maHH.equalsIgnoreCase("sua")){
                pr2.Show();
                check = false;
            }
        }
        if (check){
            System.out.println("Khong co mat hang nao co ma la Sua");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so mat hang: "); n = Integer.parseInt(sc.nextLine());
        Product2[] pro = new Product2[n];

        for (int i = 0; i < n; i++) {
            pro[i] = new Product2();
            pro[i].Input();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hang hoa thu "+(i+1));
            pro[i].Show();
        }
        System.out.println("");
        Product2.Sort(pro);
        System.out.println("");
        Product2.Find(pro);
    }
}
