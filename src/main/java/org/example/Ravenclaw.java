package org.example;

public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String firstName, String secondName, int clever, int wise, int witty, int creative, int transgression) {
        super(firstName, secondName, clever + wise + witty + creative, transgression);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int powerMagic() {
        return clever + wise + witty + creative;
    }


    public void betterStudent(Ravenclaw person2) {
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


    @Override
    public String toString() {
        return "faculty: Ravenclaw {" +
                super.toString() +
                ", powerMagic=" + powerMagic() +
                ", clever=" + clever +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }
}
