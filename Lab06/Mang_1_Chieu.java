/*
*
*
*
*
* */


import java.util.Random;

public class Mang_1_Chieu {
    public static void main(String[] args) {
        // Khai báo, khởi tạo kích thước của mảng

        int[] a;

        a = new int[10]; // index: 0,1,...9

        // Gán giá trị cho các pần tử trong mảng

        a[0] = 10;
        a[5] = 15;
        a[9] = 30;

        // Duyệt mảng và lấy giá trị để hiển thị

        for(int i = 0; i < 10; i++){
            System.out.printf("%4d" , a[i]);
            System.out.println("");
        }
        System.out.println();

        // Gán gi trị nẫu nhin cho các phần ử trong mảng
        System.out.println("Mảng có giá trị ngẫu nhiên");
        for(int i = 0; i<10; i++){
            Random rand = new Random();
            a[i] = rand.nextInt(99);
            System.out.printf("%4d" , a[i]);
        }
        System.out.println();

        //Sắp xếp tăng dần
        for(int i = 0; i<10; i++){
            for(int j = i+1; j<9; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // in mẳng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần");
        for(int i = 0; i < 10; i++){
            System.out.printf("%4d" , a[i]);
        }
        System.out.println();
        // chèn 1 phần từ vào mảng
    }
}
