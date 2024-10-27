package org.example.oops_1;

public class Main {
    public static void main(String[] args) {
        Student one = new Student();
        one.name = "Neha";
        one.age = 22;
        one.psp = 95;
        one.changeBatch();
        one.joinClass();
        one.printDetails();

        Student two = new Student();
        two.name = "Tanya";
        two.age = 21;
        two.psp = 90;
        two.changeBatch();
        two.joinClass();
        two.printDetails();
    }
}
