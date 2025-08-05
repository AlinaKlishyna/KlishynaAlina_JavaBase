package com.gmail.alinakotova102.corsoRanstad.file;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void writeNameToFile(String path) {
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(getName() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> displayNameSortByFile(String path) {
        String line;
        StringBuilder text = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append(" ");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] names = text.toString().split("[^A-Za-z]+");
        return Arrays.stream(names).sorted().toList();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    public static void main(String[] args) {
        String pathToWrite = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/output.txt";

        Student[] students = new Student[]{
                new Student("Lol", "Lok"),
                new Student("Bibby", "Loki"),
                new Student("Pop", "Loky"),
                new Student("Vova", "Loko"),
                new Student("Zhenya", "Lokt")
        };

        for (Student student : students) {
            student.writeNameToFile(pathToWrite);
        }

        System.out.println(displayNameSortByFile(pathToWrite));
    }
}
