package TuLam_05;

import java.util.*;

public class ProductsTest {

    public static void main(String[] args) {
        Map<Integer, Product> products = new TreeMap<Integer, Product>();

        System.out.println("Nhập số lượng sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập id: ");
            int id = sc.nextInt();
            System.out.print("Nhập tên sản phẩm: ");
            String name = sc.next();
            System.out.print("Nhập nhà sản xuất: ");
            String producer = sc.nextLine();
            System.out.print("Nhập năm sản xuất: ");
            int yearMarking = sc.nextInt();
            System.out.print("Nhập giá tiền: ");
            double price = sc.nextDouble();
            Product product = new Product();
            products.put(i,product);
        }

        System.out.println("Danh sách sản phẩm: ");
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getValue());
        }

        //Hiển thị thông tin tăng dần theo năm sản xuất
        System.out.println("Danh sách sản phẩm sắp xếp theo năm sản xuất: ");
        products.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().yearMaking))
                .forEach(entry -> System.out.println(entry.getValue()));

    }
}
