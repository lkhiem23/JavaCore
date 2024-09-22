package Bai_TH_03_Generic;

public class AdvancedComparion<T extends Comparable<? super T>> {
    private T t;

    public void maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a)>0){
            max = b;
        }if (c.compareTo(b)>0){
            max = c;
        }
        System.out.println("Maximum: " + max);

    }
}
