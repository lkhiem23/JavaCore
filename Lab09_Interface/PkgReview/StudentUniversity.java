package PkgReview;

public class StudentUniversity extends Student{
    protected float score4;

    public StudentUniversity(){
        super();
    }

    public StudentUniversity(String name, int year, float score1, float score2, float score3, float score4){
        super();
        this.score4 = score4;
    }

    @Override
    public double average() {
        return 0;
        //return (super.average()+score4)/2;
    }

    public void show(){
        super.show();
        System.out.println("Score 4: " + score4);
        System.out.println("Average: " + average());
    }

    @Override
    public String toString() {
        return super.toString() +
                "score4=" + score4 +
                ", average='" + average() +
                '}';
    }
}
