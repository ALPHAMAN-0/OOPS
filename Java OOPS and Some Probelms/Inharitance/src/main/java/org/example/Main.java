package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");

        System.out.println(dog.speak());
        dog.eat();

        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date: " + myDate);

    }
}
