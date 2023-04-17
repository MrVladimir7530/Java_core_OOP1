package org.example;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desirePower;

    public Slytherin(String firstName, String secondName, int cunning, int determination, int ambition, int resourcefulness, int desirePower) {
        super(firstName, secondName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desirePower = desirePower;
    }

    public Slytherin(Hogwarts person, int cunning, int determination, int ambition,  int resourcefulness, int desirePower) {
        super(person.getFirstName(), person.getSecondName());
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desirePower = desirePower;
    }

    public void BetterStudent(Slytherin person2) {
        int sumPerson1 = ambition + determination + cunning + resourcefulness + desirePower;
        int sumPerson2 = person2.cunning + person2.determination + person2.ambition + person2.resourcefulness + person2.desirePower;
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
        return "faculty: Slytherin {" +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desirePower=" + desirePower +
                '}';
    }
}
