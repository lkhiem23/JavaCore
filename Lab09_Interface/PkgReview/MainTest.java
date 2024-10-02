package PkgReview;

public class MainTest {
    public static void main(String[] args) {
        Student student = new StudentCollege();
        student.name = "Khiem";
        student.year = 15;
        student.show();

        System.out.println("========");

        student = new StudentUniversity();
        student.name = "Khiem";
        student.year = 21;
        student.show();

        StudentCollege std = new StudentCollege();
        std.name = "Khiem";
        std.year = 19;
        std.score1 = 9;
        std.score2 = 8;
        std.score3 = 7;
        std.show();


    }
}
