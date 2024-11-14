/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab3_bai4;

/**
 *
 * @author tung0
 */
public class Boss extends Employee
{
    private float luong;
    public float getLuong()
    {
        return luong;
    }
    public void setLuong(float luong)
    {
        this.luong = luong;
    }
    
    @Override
    public float earnings() 
    {
        return luong=4500; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hienthi() 
    {
        System.out.println("Luong "+luong);; //To change body of generated methods, choose Tools | Templates.
    }
    
}

