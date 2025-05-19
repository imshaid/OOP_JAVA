package Lab_1;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();

        std1.id = "241-15-360";
        std1.name = "Md. Shaid Hasan";
        std1.cgpa = 3.83;

        std1.display();
        std1.doStudy();
        std1.doAssignment();
    }
}