package Lab_1;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student std1 = new Student();

        std1.id = "241-15-360";
        std1.name = "Md. Shaid Hasan";
        std1.cgpa = 3.83;

        std1.display();
        std1.doStudy();
        std1.doAssignment();

        System.out.println();

        // Creating a Teacher object
        Teacher tec1 = new Teacher();

        tec1.id = "710002796";
        tec1.name = "Ms. Nasima Islam Bithi";
        tec1.deg = "Lecturer";
        tec1.email = "bithi.cse@diu.edu.bd";
        tec1.dept = "Department of Computer Science and Engineering";
        tec1.faculty = "Faculty of Science and Information Technology";
        tec1.room = "KT-505";
        tec1.phone = "0123456789";

        tec1.display();
        tec1.takeAttendance();
        tec1.evaluateAssignment();
        tec1.arrangeExam();
    }
}