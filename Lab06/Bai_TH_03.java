import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bai_TH_03 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("PHP");
        arr.add("Java");
        arr.add("HTML");
        arr.add("C++");
        arr.add("C#");
        arr.add("Python");

        System.out.println("Danh sách trước khi sắp xếp: ");
        for (int i = 0; i < arr.size(); i++) {
            String get = arr.get(i).toString();
            System.out.println((i+1) + ": " + get);
            }

        System.out.println("Danh sách sau khi sắp xếp: ");
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i+1) + ": " + arr.get(i));

        }

    }
}
