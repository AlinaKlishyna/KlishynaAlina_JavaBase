package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public abstract class Persona {
    private String name;
    private String lastname;
    private int age;

    public Persona(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}

class Studente extends Persona {

    public Studente(String name, String lastname, int age) {
        super(name, lastname, age);
    }
}

class Insegnante extends Persona {

    public Insegnante(String name, String lastname, int age) {
        super(name, lastname, age);
    }
}
