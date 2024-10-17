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
public class TuLanh extends DienLanh{
    private float dungTich;
    private double dienAp;

    public float getDungTich() {
        return dungTich;
    }

    public void setDungTich(float dungTich) {
        this.dungTich = dungTich;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap dung tich: ");
        dungTich = sc.nextFloat();
        System.out.println("Nhap dien ap: ");
        dienAp = sc.nextDouble();
    }
    
    @Override
    public void hienthi(){
        super.hienthi();
        System.out.println("Dung tich: "+dungTich +"L");
        System.out.println("Dien ap: "+dienAp + "W");
    }
    
    public double thanhTien(){
        if(dungTich > 100){ 
            return dungTich*200000;
        }else if(dungTich > 50){
            return dungTich*100000;
        }else{
            return 200000;
        }
    }

}
