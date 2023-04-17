package org.example;

public class Hufflepuff extends Hogwarts {
    private int industrious;
    private int loyal;
    private int honest;

    public Hufflepuff(String firstName, String secondName, int industrious, int loyal, int honest) {
        super(firstName, secondName);
        this.industrious = industrious;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Hufflepuff(Hogwarts person, int industrious, int loyal, int honest) {
        super(person.getFirstName(), person.getSecondName());
        this.industrious = industrious;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void BetterStudent(Hufflepuff person2) {
        int sumPerson1 = honest + loyal + industrious;
        int sumPerson2 = person2.industrious + person2.loyal + person2.honest;
        if (sumPerson1 > sumPerson2) {
            System.out.println(getFirstName() + " Лучшее, чем " + person2.getFirstName());
        } else if(sumPerson1 < sumPerson2) {
            System.out.println(person2.getFirstName() + " Лучшее, чем " + getFirstName());
        }
        else {
            System.out.println(getFirstName() + " и "+ person2.getFirstName() + " равны");
        }
    }

    @Override
    public String toString() {
        return "faculty: Gryffindor {" +
                super.toString() +
                ", industrious=" + industrious +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
