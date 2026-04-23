package org.example;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(color);
    }
}

class Student{
    String name;
    int age;
    String gender;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }

    Student(Student a){
        this.name = a.name;
        this.age = a.age;
        this.gender = a.gender;
    }

    Student(){

    }
}
public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type="gel";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type="gel";

        pen1.printColor();
        pen2.printColor();

        Student s = new Student();

        s.name = "siam";
        s.age = 18;
        s.gender = "male";

        Student a = new Student(s);
        a.printInfo();

    }
}