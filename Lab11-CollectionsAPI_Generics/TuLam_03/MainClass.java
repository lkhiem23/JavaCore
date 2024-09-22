package TuLam_03;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "VietNam");
        map.put(2, "Malaysia");
        map.put(3, "Canada");
        map.put(4, "France");
        map.put(5, "Angola");
        map.put(6, "Denmark");

        System.out.println("Danh sách các quốc gia: " + map);

        List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        System.out.println("------- Danh sách sắp xếp tăng dần theo tên các quốc gia ------- ");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
