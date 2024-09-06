package Lab02;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        int month,year,soNgay = 0;
        Scanner sc = new Scanner(System.in);

        /*
        do {
            System.out.print("Nhập tháng: ");
            month = sc.nextInt();
            System.out.print("Nhập năm: ");
            year = sc.nextInt();

            if(month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12){
                System.out.println("Tháng "+ month + " năm " + year + " có 300 ngày");
            } else if (month == 2 && year%4 == 0) {
                System.out.println("Tháng "+ month + " năm " + year + " có 29 ngày");
            }else if (month == 2){
                System.out.println("Tháng "+ month + " năm " + year + " có 28 ngày");
            }
            else {
                System.out.println("Tháng "+ month + " năm " + year + " có 30 ngày");
            }

        }while (month>=1);
*/
        System.out.print("Nhập tháng: ");
        month = sc.nextInt();
        System.out.print("Nhập năm: ");
        year = sc.nextInt();

        switch (month) {
            case 1:
                case 3:
                    case 5:
                        case 7:
                            case 8:
                                case 10:
                                    case 12:
                                        soNgay = 31;
                                        break;
            case 4:
                case 6:
                    case 9:
                        case 11:
                            soNgay = 30;
                            break;
           case 2:
               if (year%4 == 0 && year %100!=0 || year%400 == 0) {
                   soNgay = 29;
               }else {
                   soNgay = 28;
               }
               break;

            default:
                System.out.println("Nhập sai dữ liệu tháng, năm.");
        }// ./end switch

        //Xuất
        if (soNgay > 0){
            System.out.printf("\nTháng %d, năm %d, có %d ngày!",month,year,soNgay);
        }

    }
}
