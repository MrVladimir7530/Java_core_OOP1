package org.example;

public class StudentHogwarts {
    private int id;
    private String[] studentsBase;

    public StudentHogwarts(int size) {
        studentsBase = new String[size];
        id = 0;
    }

    public StudentHogwarts() {
        studentsBase = new String[100];
        id = 0;
    }

    public void add(Gryffindor person){
        studentsBase[id] = person.toString();
        id++;
    }

    public void add(Hufflepuff person){
        studentsBase[id] = person.toString();
        id++;
    }

    public void add(Ravenclaw person){
        studentsBase[id] = person.toString();
        id++;
    }

    public void add(Slytherin person){
        studentsBase[id] = person.toString();
        id++;
    }

    public void printStudent(){
        for (int i = 0; i < id; i++) {
            System.out.println(studentsBase[i]);
        }
    }
}
