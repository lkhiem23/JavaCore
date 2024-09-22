package TuLam_02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Collection {


    public static void main(String[] args) {
        Set<String> set  = new HashSet<String>();

        set.add("Thái Nguyên");
        set.add("Hà Nội");
        set.add("Hải Phòng");


        System.out.println("Danh sách các thành phố: " + set);

        TreeSet<String> sortedSet = new TreeSet<>(set);
       System.out.println("Danh sách sắp xếp tăng dần: "+sortedSet);

    }
}
