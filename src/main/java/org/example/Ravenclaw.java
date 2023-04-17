package org.example;

public class Ravenclaw extends Hogwarts{
    private int clever;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String firstName, String secondName, int clever, int wise, int witty, int creative) {
        super(firstName, secondName);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public Ravenclaw(Hogwarts person, int clever, int wise, int witty,  int creative) {
        super(person.getFirstName(), person.getSecondName());
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void BetterStudent(Ravenclaw person2) {
        int sumPerson1 = witty + wise + clever + creative;
        int sumPerson2 = person2.clever + person2.wise + person2.witty + person2.creative;
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
        return "faculty: Ravenclaw {" +
                super.toString() +
                ", clever=" + clever +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }
}
