/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab3_bai4;

import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class PieceWorker extends Employee
{
    private float soluongsanpham;
    private float luong;

    @Override
    public float earnings() 
    {
        Scanner sc = new Scanner(System.in); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap vao so luong san pham");
        soluongsanpham = Float.parseFloat(sc.nextLine());
        
        return luong = (float) (soluongsanpham*0.5);
    }

    @Override
    public void hienthi() 
    {
        System.out.println("Luong "+luong); //To change body of generated methods, choose Tools | Templates.
    }
}
