/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lehoaikhiem_ktra_25_5;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TheMuon {
    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String  soHieuSach;
    private SVien sinhvien;
   
    public TheMuon() {
    }

    public TheMuon(String soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SVien sinhvien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhvien = sinhvien;
    }

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SVien sinhvien) {
        this.sinhvien = sinhvien;
    }
    
   public void nhapThongTin(Scanner scanner){
       System.out.println("Nhập số phiếu mượn :");
       this.soPhieuMuon = scanner.nextLine();
       System.out.println("Nhập ngày mượn : ");
       this.ngayMuon=scanner.nextLine();
       System.out.println("Nhập hạn trả :");
       this.hanTra=scanner.nextLine();
       System.out.println("Nhập số hiệu sách : ");
       this.soHieuSach=scanner.nextLine();
       this.sinhvien=new SVien();
       this.sinhvien.nhapThongTin(scanner);
   } 
   
   public void hienThiThongTin(){
       System.out.println("Số phiếu mượn : "+this.soPhieuMuon);
       System.out.println("Ngày mượn : "+this.ngayMuon);
       System.out.println("Hạn trả : "+this.hanTra);
       System.out.println("Số hiệu sách : "+this.soHieuSach);
       this.sinhvien.hienThiThongTin();
   }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TheMuon> danhSachTheMuon = new ArrayList<>();
        int n = 0;
        
        //nhập số lượng thẻ mượn
        while(true){
            try{
                System.out.println("Nhập số lượng thẻ mượn : ");
             n = Integer.parseInt(scanner.nextLine());
            if(n < 0){
                throw new ArithmeticException("Số lượng thẻ mượn phải lớn hơn 0");
            }
            break;
            }catch(NumberFormatException e){
                System.out.println("NumberFormatException: Số lượng thẻ mượn phải là số nguyên. Vui lòng nhập lại");
            }catch(ArithmeticException e){
                System.out.println("ArithmenticException : "+e.getMessage());
            }   
        }
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin thẻ mượn thứ " + (i+1) + ": ");
            TheMuon theMuon = new TheMuon();
            theMuon.nhapThongTin(scanner);
            danhSachTheMuon.add(theMuon);
        }
        //Hiển thị thông tin các thẻ mượn
        System.out.println("\nThông tin các thẻ mượn : ");
        for(TheMuon theMuon : danhSachTheMuon){
            theMuon.hienThiThongTin();
        }
        
        //Hiển thị thông tin của lớp CNTT
        System.out.println("\nThông tin thẻ mượn của sinh viên lớp CNTT");
        for(TheMuon theMuon : danhSachTheMuon){
            if(theMuon.getSinhvien().getLop().equals("CNTT")){
                theMuon.hienThiThongTin();
            }
        }
    }

}
