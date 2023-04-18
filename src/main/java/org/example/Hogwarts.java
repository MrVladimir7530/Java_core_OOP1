package org.example;

public abstract class Hogwarts {
    private String firstName;
    private String secondName;
    private int powerMagic;

    public Hogwarts(String firstName, String secondName, int powerMagic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.powerMagic = powerMagic;
    }
    protected int powerMagic(){
        return 0;
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
