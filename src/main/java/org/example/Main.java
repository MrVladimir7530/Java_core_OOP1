package org.example;

public class Main {
    public static void main(String[] args) {
        Hogwarts hermioneGranger = new Hogwarts("Hermione", "Granger");
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 4, 5, 4);
        Gryffindor hermione = new Gryffindor(hermioneGranger, 5, 5, 4);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 4, 5, 5, 5, 4);

        Hufflepuff smith = new Hufflepuff("Zaharias", "Smith", 5, 4, 3);

        Hogwarts zhouChang = new Hogwarts("Zhou", "Chang");
        Ravenclaw zhou = new Ravenclaw(zhouChang, 2, 5, 5, 3);

        ron.BetterStudent(hermione);

        StudentHogwarts studentHogwarts = new StudentHogwarts();
        studentHogwarts.add(ron);
        studentHogwarts.add(hermione);
        studentHogwarts.add(draco);
        studentHogwarts.add(smith);
        studentHogwarts.add(zhou);

        studentHogwarts.printStudent();

    }
}