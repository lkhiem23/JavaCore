package TuLam_01;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> lstInt = new ArrayList<Integer>();
        lstInt.add( 1);
        lstInt.add( 9);
        lstInt.add(5);
        lstInt.add(4);


        System.out.println("Danh sách các số nguyên: ");
        for(int i=0;i<lstInt.size();i++){
            System.out.println(lstInt.get(i));
        }

        TreeSet<Integer> sortedset = new TreeSet<Integer>(lstInt);
        System.out.println("Danh sách sau khi sắp xếp: " + sortedset);



    }
}
