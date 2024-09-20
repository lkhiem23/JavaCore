import java.util.ArrayList;

public class ArraysList_Demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for(var item: list){
            System.out.println(item);
        }

        //Duyệt tuần tự
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
