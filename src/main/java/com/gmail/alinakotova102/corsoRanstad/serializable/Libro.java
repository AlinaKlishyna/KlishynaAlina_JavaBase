package com.gmail.alinakotova102.corsoRanstad.serializable;

import java.io.*;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String titolo;
    private String author;
    private int year;

    public Libro(String titolo, String author, int year) {
        this.titolo = titolo;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Libro[] libri = new Libro[] {
                new Libro("Maugli", "Stiven King", 2010),
                new Libro("Hrizontema", "Racel King", 2019),
                new Libro("Lorry Dans", "Shevchenko Taras", 1995)
        };

        String pathToFile = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/serializable/libri.ser";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(pathToFile))) {
                out.writeObject(libri);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(pathToFile))){
            Libro[] libriByFile = (Libro[]) in.readObject();

            for (Libro libro : libriByFile) {
                System.out.println(libro);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
