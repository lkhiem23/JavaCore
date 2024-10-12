/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kiemtra_8th4;

/**
 *
 * @author ADMIN
 */
public class LeHoaiKhiem {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GiaoVien a = new GiaoVien("Quân",21,"LapTrinh",1811,2.5,true);
        GiaoVien b = new GiaoVien("Khiêm",20,"Anh",612,2,false);
        SinhVien c = new SinhVien("Ngọc",19,3,"BKAV");
        a.ThongTin();
        System.out.println();
        b.ThongTin();
        System.out.println();
        c.ThongTin();
    }
    
}
