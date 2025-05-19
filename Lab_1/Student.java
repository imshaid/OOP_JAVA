package Lab_1;

public class Student {
    String id;
    String name;
    double cgpa;
    
    public void doStudy() {
        System.out.println(name + " is studying properly.");
    }

    public void doAssignment() {
        System.out.println(name + " has submitted the assignment properly.");
    }

    public void display() {
        System.out.println();
        System.out.println("----- Student Information -----");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("CGPA   : " + cgpa);
        System.out.println();
    }
}