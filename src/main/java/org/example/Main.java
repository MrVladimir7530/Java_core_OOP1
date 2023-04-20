package org.example;

public class Main {
    public static void main(String[] args) {
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 4, 5, 4, 170);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", 5, 5, 4, 210);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 4, 5, 5, 5, 4, 220);

        Hufflepuff smith = new Hufflepuff("Zaharias", "Smith", 5, 4, 3, 167);

        Ravenclaw zhou = new Ravenclaw("Zhou", "Chang", 2, 5, 5, 3, 159);

        StudentHogwarts studentHogwarts = new StudentHogwarts();
        studentHogwarts.add(ron);
        studentHogwarts.add(hermione);
        studentHogwarts.add(draco);
        studentHogwarts.add(smith);
        studentHogwarts.add(zhou);

        studentHogwarts.printStudent();

        ron.betterStudent(hermione);
        hermione.betterStudentInHogwarts(draco);
    }
}