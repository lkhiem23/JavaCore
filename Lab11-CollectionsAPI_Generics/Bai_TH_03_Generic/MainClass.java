package Bai_TH_03_Generic;

public class MainClass {
    public static void main(String[] args) {
        AdvancedComparion<Integer> aInterger = new AdvancedComparion<Integer>();
        AdvancedComparion<String> aString = new AdvancedComparion<String>();
        AdvancedComparion<Float> aFloat = new AdvancedComparion<>();

        aInterger.maximum(7,6,9);
        aFloat.maximum(5.3f,9.9f,1.2f);
        aString.maximum("Việt Nam","ThaiLand" ,"Malaysia" );


    }
}
