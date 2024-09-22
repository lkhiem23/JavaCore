package Bai_TH_01_ListSetMap;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> lstStudent = new ArrayList<>();

    public void input(){
        lstStudent.add("Khiem");
        lstStudent.add("Le");
        lstStudent.add("Ahmad");
        lstStudent.add("Hoai");
    }

    public void output(){
        System.out.println();
        System.out.println("Danh sach Ten: " + lstStudent);
    }

    public void sua(){
        lstStudent.set(2,"Trang Anh");
        System.out.println("Danh sach sau khi sua: " + lstStudent);
    }

    public void xoa(){
        lstStudent.remove(3);
        System.out.println("Danh sach sau khi xoa: " + lstStudent);
    }


    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.input();
        sm.output();
        sm.sua();
        sm.xoa();
    }
}

