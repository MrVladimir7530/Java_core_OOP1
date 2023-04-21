package org.example;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desirePower;

    public Slytherin(String firstName, String secondName, int cunning, int determination, int ambition, int resourcefulness, int desirePower, int transgression) {
        super(firstName, secondName, cunning + determination + ambition + resourcefulness + desirePower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desirePower = desirePower;
    }

    public int powerMagic() {
        return cunning + determination + ambition + resourcefulness + desirePower;
    }


    public void betterStudent(Slytherin person2) {
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
        return "faculty: Slytherin {" +
                super.toString() +
                ", powerMagic=" + powerMagic() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desirePower=" + desirePower +
                '}';
    }
}
