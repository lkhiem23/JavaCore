/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lhkhiem_06thang5;

/**
 *
 * @author ADMIN
 */
public class Entry {
    public static void main(String[] args){
        ThuMuc rootThuMuc = new ThuMuc("E:");
        ThuMuc systemThuMuc = new ThuMuc("Phim");
        ThuMuc documentsThuMuc = new ThuMuc("Hoc Tap");

        rootThuMuc.addFolder(systemThuMuc);
        rootThuMuc.addFolder(documentsThuMuc);

        TapTin configFile = new TapTin("Ngay Cu", "mp4", 2048);
        TapTin programFile = new TapTin("Bai3", "cpp", 1024);
        TapTin resumeFile = new TapTin("Dien Bien", "mp4", 4096);

        documentsThuMuc.addFile(configFile);
        documentsThuMuc.addFile(resumeFile);
        systemThuMuc.addFile(programFile);

        System.out.println("Cau truc thu muc:");
        rootThuMuc.displayStructure("");

        System.out.println("\nTong dung luong cua thu muc tai lieu: " + documentsThuMuc.getTotalSize() + " bytes");

        TapTin largestFile = rootThuMuc.findLargestFile();
        if (largestFile != null) {
            System.out.println("\nTap tin lon nhat: " + largestFile.getName() + "." + largestFile.getExtension() + " (" + largestFile.getSize() + " bytes)");
            System.out.println(" ");
        } else {
            System.out.println("\nKhong tim thay tap tin.");
        }
    }
}
