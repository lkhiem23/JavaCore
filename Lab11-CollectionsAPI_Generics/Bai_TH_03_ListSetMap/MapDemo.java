package Bai_TH_03_ListSetMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Khiem");
        map.put("2", "Quan");
        map.put("3", "Huong");
        map.put("4", "Ngoc");
        map.put("5", "Anh");
        map.put("6", "Linh");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
        System.out.println("Sinh Vien so 6 la: " + map.get("6"));
        System.out.println("--- Xoa sinh vien so 6 --- "+ map.remove("6"));
        System.out.println("Danh sach sau khi xoa: " + map);
    }
}
