package org.example;

public class Hufflepuff extends Hogwarts {
    private int industrious;
    private int loyal;
    private int honest;

    public Hufflepuff(String firstName, String secondName, int industrious, int loyal, int honest, int transgression) {
        super(firstName, secondName, industrious + loyal + honest, transgression);
        this.industrious = industrious;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int powerMagic() {
        return industrious + loyal + honest;
    }


    public void betterStudent(Hufflepuff person2) {
        int sumPerson1 = powerMagic();
        int sumPerson2 = person2.powerMagic();
        if (sumPerson1 > sumPerson2) {
            System.out.println(getFirstName() + " Лучшее, чем " + person2.getFirstName());
        } else if (sumPerson1 < sumPerson2) {
            System.out.println(person2.getFirstName() + " Лучшее, чем " + getFirstName());
        } else {
            System.out.println(getFirstName() + " и " + person2.getFirstName() + " равны");
        }
    }

    public void betterStudentInHogwarts(Hogwarts person2) {
        if (transgression > person2.getTransgression()) {
            System.out.println(getFirstName() + " Лучшее, чем " + person2.getFirstName());
        } else if (transgression < person2.getTransgression()) {
            System.out.println(person2.getFirstName() + " Лучшее, чем " + getFirstName());
        } else {
            System.out.println(getFirstName() + " и " + person2.getFirstName() + " равны");
        }
    }

    @Override
    public String toString() {
        return "faculty: Gryffindor {" +
                super.toString() +
                ", powerMagic=" + powerMagic() +
                ", industrious=" + industrious +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
