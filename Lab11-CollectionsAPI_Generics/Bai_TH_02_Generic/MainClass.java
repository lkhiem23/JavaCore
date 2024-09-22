package Bai_TH_02_Generic;

public class MainClass {

    public static <E> void printArray(E[] arr) {
        for(E e : arr) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,3,2,4};
        String[] stringsArr = {"Le","Hoai","Khiem"};
        Double[] doublesArr = {1.1,2.22,3.55};
        Character[] charArr = {'a','b','c'};

        System.out.println("---INTERGER-----");
        printArray(intArr);
        System.out.println("----STRING----");
        printArray(stringsArr);
        System.out.println("----DOUBLE----");
        printArray(doublesArr);
        System.out.println("----CHARACTER----");
        printArray(charArr);

    }
}
