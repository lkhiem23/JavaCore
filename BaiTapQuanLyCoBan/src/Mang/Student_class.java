/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo6;

/**
 *
 * @author tung0
 */
public class Student_class {
    String ten;
    String masv;
    String ngaysinh;
    float diem;
    
    public Student_class(){
        this.ten = "Tung";
        this.masv = "21103200091";
        this.ngaysinh = "27/03/2003";
        this.diem = 10.0f;
    }
    
    public Student_class(String ten1){
        this.ten = ten1;
    }
    
    public Student_class(String ten2, String masv2){
        this.ten = ten2;
        this.masv = masv2;
    }
    
    public Student_class(String ten3, String masv3, String ngaysinh3){
        this.ten = ten3;
        this.masv = masv3;
        this.ngaysinh = ngaysinh3;
    }
    
    public Student_class(String ten4, String masv4, String ngaysinh4, float diem4){
        this.ten = ten4;
        this.masv = masv4;
        this.ngaysinh = ngaysinh4;
        this.diem = diem4;
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return this.ten;
    }
    
    public void setMasv(String masv){
        this.masv = masv;
    }
    public String getMasv(){
        return this.masv;
    }
    
    public void setNgaysinh(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getNgaysinh(){
        return this.ngaysinh;
    }
    
    public void setDiem(float diem){
        this.diem = diem;
    }
    public float getDiem(){
        return this.diem;
    }
    
    public static void main(String[] args){
        Student_class sv1 = new Student_class();
        Student_class sv2 = new Student_class("ahihi");
        Student_class sv3 = new Student_class("asd", "jaiwdj");
        Student_class sv4 = new Student_class("kajsdla", "iaowdajwd", "1/2/3");
        Student_class sv5 = new Student_class("aijsd", "oaijdowa", "3/1/2", 20.0f);
        
        
        sv5.setTen("iajwoidwaoisdjo"); sv5.setMasv("1232342"); sv5.setNgaysinh("22/11/33"); sv5.setDiem(299.0f);
        System.out.println("New class: "+sv5.getTen()+" "+sv5.getMasv()+" "+sv5.getNgaysinh()+" "+sv5.getDiem());
    }
    
}
