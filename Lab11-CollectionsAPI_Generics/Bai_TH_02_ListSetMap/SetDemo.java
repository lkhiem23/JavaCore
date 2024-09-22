package Bai_TH_02_ListSetMap;

import java.util.Arrays;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        int count[] = {1,42,12,9,10,24};
        System.out.println("Danh sách ban đầu: " + Arrays.toString(count));

        TreeSet sortedSet = new TreeSet<Integer>();

        for(int i = 0; i < count.length; i++){
            sortedSet.add(count[i]);
        }

        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + sortedSet);

        System.out.println("Biến đầu tiên trong danh sách là: "+ sortedSet.first());

        System.out.println("Biến cuối cùng trong danh sách là: "+ sortedSet.last());

    }
}
