package Bai_TH_01_Generic;

public class MainClass {
    public static void main(String[] args) {
        MyGenerics<String> stringMyGenerics = new MyGenerics<>();
        MyGenerics<Integer> integerMyGenerics = new MyGenerics<>();

        stringMyGenerics.setT(new String("Tôi là người Việt Nam!"));
        integerMyGenerics.setT(new Integer(123));

        //Xuất ra màn hình
        System.out.println("Giá trị stringMyGenerics= " + stringMyGenerics.getT());
        System.out.println("Giá trị integerMyGenerics= " + integerMyGenerics.getT());
    }
}
