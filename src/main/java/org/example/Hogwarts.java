package org.example;

public abstract class Hogwarts {
    private String firstName;
    private String secondName;
    private int powerMagic;
    private int transgression;

    public Hogwarts(String firstName, String secondName, int powerMagic, int transgression) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
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

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName +
                ", secondName: " + secondName;
    }
}
