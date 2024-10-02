package PkgReview;

 public abstract class Student {
        protected String name;
        protected int year;


        public Student() {

        }
     public Student(String name, int year) {
         this.name = name;
         this.year = year;
     }

     //Phương thức hiển thị có nội dung

     public void show(){
         System.out.println("Name: " + name);
         System.out.println("Year: " + year);
     }

     //Phương thức trừu tươợng: Không có nội dung

     public abstract double average();


}

