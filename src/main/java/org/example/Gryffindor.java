package org.example;


public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String secondName, int nobility, int honor, int bravery, int transgression) {
        super(firstName, secondName, honor + nobility + bravery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int powerMagic() {
        return nobility + honor + bravery;
    }


    public void betterStudent(Gryffindor person2) {
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
        return "faculty: Gryffindor {" +
                super.toString() +
                ", powerMagic=" + powerMagic() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
