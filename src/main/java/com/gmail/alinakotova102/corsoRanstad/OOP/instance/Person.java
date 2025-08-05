package com.gmail.alinakotova102.corsoRanstad.OOP.instance;

public abstract class Person {
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}


class Studente extends Person{
    private String corso;

    public Studente(String name, String lastname, String corso) {
        super(name, lastname);
        this.corso = corso;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", corso='" + corso + '\'' +
                '}';
    }
}

class Runner {
    public static void stampaTipo(Object obj) {
        if (obj instanceof Integer) {
            System.out.println(Integer.class.getName());
        } else if (obj instanceof Studente) {
            System.out.println(Studente.class.getName());
        } else if (obj instanceof String) {
            System.out.println(String.class.getName());
        } else if (obj == null) {
            System.out.println("null");
        } else {
            System.out.println("Object");
        }
    }

    public static void main(String[] args) {
        Studente oggetto = new Studente("Bax", "Bunny", "Psicoligia");
        System.out.println(oggetto instanceof Studente);

        stampaTipo(oggetto);

        Studente altro;
        if (oggetto instanceof Studente) {
            altro = (Studente) oggetto;
        }

        Person altroOggetto;
        if (oggetto instanceof Person) {
            altroOggetto = (Studente) oggetto;
        }

        if ("text" instanceof String) {
            System.out.println(true);
        }
    }
}
