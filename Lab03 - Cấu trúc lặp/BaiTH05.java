public class BaiTH05 {
    // Đọc từng số thập phân
    public void docSo(double soThapPhan){
        if (soThapPhan < 20){
            phatAm((int) soThapPhan);
        } else if (soThapPhan >= 20 && soThapPhan < 100) {
            phatAm((int) soThapPhan / 10);
            System.out.println(" mươi");
        }
    }

    // Chuyển đổi số người nhập thành chữ
    public void number4Text(double number){
            double phanDu = number;
            do {
                phanDu = number%10;
                double thapPhan = number - phanDu;
            }while (phanDu > 10);
    }

    // Chuyển số từ 1-9 thành chữ tương ứng
    public void phatAm(int so){
        switch (so){
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Tư");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
        }
    }
    public static void main(String[] args) {

    }
}
