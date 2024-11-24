public class Lab01_OOP {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Khiem", 30000);
        staff[1] = new Employee("Hoai", 30000);
        staff[2] = new Employee("Le", 30000);

        for(inti = 0; i<staff.length;i++){
            Employee e = staff[i];
            System.out.println("name = " + e.getName());
        }
    }
}

class Employee {
    public Employee(String s, double s) {
        name = n;
        salary = s;
    }
    public Employee(double s) {
        this(Employee, s);
    }
}

public int getId()
{
    return id;
}

id = nextId;
nextId++;

    Random generator= new Random();
    // set nextId to a random number between 0 and 9999
    nextId = generator.nextInt(10000);
        private String name = "";
        private double salary;
        private int id;
        private static int nextId;
