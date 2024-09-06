import java.util.Scanner;

public class Bai09 {

    public static void menu(){
        System.out.println("Cuối tuần bạn làm gì");
        System.out.println("1. Đi học Java");
        System.out.println("2. Đi chơi công viên ngắm gấu");
        System.out.println("3. Đi (về) nhà nghỉ");
        System.out.println("4. Ra sông Hồng tắm tiên");
        System.out.println("5. Ngủ cả ngày");
        System.out.println("6. Thoát.");
    }

    public static void main(String[] args) {
        int chon = 0;
        Scanner sc = new Scanner(System.in);

        do{
            menu();
            System.out.println("Chọn: ");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("1. Đi học Java");
                    break;
                case 2:
                    System.out.println("2. Đi chơi công viên ngắm gấu");
                    break;
                case 3:
                    System.out.println("3. Đi (về) nhà nghỉ");
                    break;
                case 4:
                    System.out.println("4. Ra sông Hồng tắm tiên");
                    break;
                case 5:
                    System.out.println("5. Ngủ cả ngày");
                    break;
                case 6:
                    System.out.println("Kết thúc!");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Bạn chọn sai, vui lòng chọn lại từ 1->6");

            }
        }while (chon != 6);
    }
}
