package org.example;


public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String secondName, int nobility, int honor, int bravery) {
        super(firstName, secondName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Gryffindor(Hogwarts person, int nobility, int honor, int bravery) {
        super(person.getFirstName(), person.getSecondName());
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void BetterStudent(Gryffindor person2) {
        int sumPerson1 = nobility + honor + bravery;
        int sumPerson2 = person2.nobility + person2.honor + person2.bravery;
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
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
