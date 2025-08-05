package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi8_10;

public class User implements Comparable<User>{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("Loki");
        User user2 = new User("Loki");
        System.out.println(user1.compareTo(user2));
    }
}
