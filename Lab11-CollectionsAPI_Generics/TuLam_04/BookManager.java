package TuLam_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookManager {
    
    private List<Book> books;
    
    public BookManager() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void sapXep(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Float.compare( o2.getPrice(),o1.getPrice());
            }
        });
    }

    
    public void hienThiBook() throws IOException {
        for (Book book : books) {
            book.output();
            System.out.println();
        }
        
    }
    
    
    
    public static void main(String[] args) throws IOException {
            BookManager bookManager = new BookManager();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Số lượng sách muốn nhập: ");
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sách thứ : "+ (i+1));
                System.out.print("Nhập mã sách: ");
                String isbn = br.readLine();
                System.out.print("Nhập tên sách: ");
                String bookName = br.readLine();
                System.out.print("Nhập tác giả: ");
                String author = br.readLine();
                System.out.print("Nhập nhà xuất bản: ");
                String publisher = br.readLine();
                System.out.print("Nhập giá tiền: ");
                Float price = Float.parseFloat(br.readLine());
                Book book = new Book(isbn, bookName, author, publisher, price);
                bookManager.addBook(book); // Lưu giá trị vào book
            }
        System.out.println("\nDanh sách sách vừa nhập:");
        bookManager.hienThiBook();

        bookManager.sapXep();

        System.out.println("\nDanh sách sách sau khi sắp xếp giảm dần theo giá:");
        bookManager.hienThiBook();
            
            
            
            


    }

   
}
