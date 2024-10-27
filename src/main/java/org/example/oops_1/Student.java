package org.example.oops_1;

public class Student {
    int age;
    float psp;
    String name;

    void changeBatch(){
        System.out.println("Change Batch");
    }

    void joinClass(){
        System.out.println(name +" has joined Class");
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
    }
}
