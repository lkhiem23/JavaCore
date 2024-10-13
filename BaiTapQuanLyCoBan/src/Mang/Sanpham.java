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
public class Sanpham {
    private String name;
    private float price;
    private float dis;

    public Sanpham(String name, float price, float dis) {
        this.name = name;
        this.price = price;
        this.dis = dis;
    }
    public Sanpham() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDis() {
        return dis;
    }

    public void setDis(float dis) {
        this.dis = dis;
    }
    
    public void setThue(){
        
    }
    
    public float getThue(){
        float new_price = (float)0.1*this.price;
        return new_price;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mat ten san pham "); this.name = sc.nextLine();
        System.out.println("Nhap vao gia san pham "); this.price = sc.nextFloat();
        System.out.println("Nhap giam gia "); this.dis = sc.nextFloat();
    }
    
    public void Show(){
        System.out.println("Ten san pham "+this.name);
        System.out.println("Gia san pham "+this.price);
        System.out.println("Giam gia "+this.dis);
        System.out.println("Thue nhap khau "+getThue());
    }
    
    public static void main(String[] args){
        System.out.print("Nhap so mat hang ");
        int n; Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        Sanpham[] sp = new Sanpham[n];
        
        for (int i = 0; i < sp.length; i++){
            System.out.println("Nhap vao thong tin san pham thu "+ (i+1));
            sp[i] = new Sanpham();
            sp[i].Input();
        }
        
        System.out.println("");
        for (int i = 0; i < sp.length; i++){
            System.out.println("Thong tin cua san pham thu "+(i+1));
            sp[i].Show();
        }
    }
}
