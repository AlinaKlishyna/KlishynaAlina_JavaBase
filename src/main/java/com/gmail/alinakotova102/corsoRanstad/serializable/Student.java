package com.gmail.alinakotova102.corsoRanstad.serializable;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    transient private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class Runner {
    public static void main(String[] args) {
        Student student = new Student("Alina", 24, 98);

        String pathFileSave = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/serializable/student.ser";

        // SERIALIZATION (object storage)
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathFileSave))) {
            outputStream.writeObject(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DESERIALIZATION (object recovery)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(pathFileSave))) {
            Object object = in.readObject(); //reading
            if (object instanceof Student) {
                Student studentByFile = (Student) object;
                System.out.println(studentByFile);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
