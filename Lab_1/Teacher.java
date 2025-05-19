package Lab_1;

public class Teacher {
    String id;
    String name;
    String deg;
    String email;
    String dept;
    String faculty;
    String room;
    String phone;

    public void takeAttendance() {
        System.out.println(name + " is taking attendance for today's class.");
    }
    
    public void evaluateAssignment() {
        System.out.println(name + " is evaluating student assignments.");
    }
    
    public void arrangeExam() {
        System.out.println("An exam has been arranged by " + name + ".");
    }    

    public void display() {
        System.out.println("----- Teacher Information -----");
        System.out.println("ID            : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Designation   : " + deg);
        System.out.println("Email         : " + email);
        System.out.println("Department    : " + dept);
        System.out.println("Faculty       : " + faculty);
        System.out.println("Room          : " + room);
        System.out.println("Phone Number  : " + phone);
        System.out.println();
    }
}