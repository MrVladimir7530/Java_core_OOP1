package org.example;

public abstract class Hogwarts {
    private String firstName;
    private String secondName;
    private int powerMagic;
    protected int transgression;

    public Hogwarts(String firstName, String secondName, int powerMagic, int transgression) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
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
