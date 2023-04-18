package org.example;

public class Main {
    public static void main(String[] args) {
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 4, 5, 4);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", 5, 5, 4);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 4, 5, 5, 5, 4);

        Hufflepuff smith = new Hufflepuff("Zaharias", "Smith", 5, 4, 3);

        Ravenclaw zhou = new Ravenclaw("Zhou", "Chang", 2, 5, 5, 3);

        StudentHogwarts studentHogwarts = new StudentHogwarts();
        studentHogwarts.add(ron);
        studentHogwarts.add(hermione);
        studentHogwarts.add(draco);
        studentHogwarts.add(smith);
        studentHogwarts.add(zhou);

        studentHogwarts.printStudent();

        ron.betterStudent(hermione);
        ron.betterStudent(smith);
    }
}