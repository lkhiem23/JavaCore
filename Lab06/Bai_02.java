import java.util.Random;

public class Bai_02 {
    public static void main(String[] args) {
        int[] n = new int[10];

        // Random mảng
        System.out.println("Mảng có giá trị ngẫu nhiên: ");
        for (int i = 0; i < n.length; i++) {
            Random rand = new Random();
            n[i] = rand.nextInt(10);
            System.out.printf("%3d ", n[i]);
        }
        System.out.println();
    }
}
