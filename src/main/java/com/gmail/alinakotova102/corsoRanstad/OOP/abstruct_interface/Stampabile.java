package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

// полезно использовать интерфейса так он имеет в себе всего 1 действие, но может использоваться в разных классах
// как в этом примере
// при этом стоит учитывать что интерфейс может имплементировать много раз
public interface Stampabile {
    void stampaDettagli();
}

class DVD implements Stampabile {
    private String titolo;
    private int timeSec;

    public DVD(String titolo, int timeSec) {
        this.titolo = titolo;
        this.timeSec = timeSec;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getTimeSec() {
        return timeSec;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titolo='" + titolo + '\'' +
                ", timeSec=" + timeSec +
                '}';
    }

    @Override
    public void stampaDettagli() {
        System.out.println(this.getClass().getSimpleName() + ": " + getTitolo() + ", " + getTimeSec());
    }
}

class Libro implements Stampabile {
    private String titolo;
    private String author;

    public Libro(String titolo, String author) {
        this.titolo = titolo;
        this.author = author;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void stampaDettagli() {
        System.out.println(this.getClass().getSimpleName() + ": " + getTitolo() + ", " + getAuthor());
    }
}

class Runner{
    public static void main(String[] args) {
        Stampabile[] stampabileLibro = new Stampabile[]{
                new Libro("Maugli", "Stiven King"),
                new DVD("PS 5", 455)
        };

        for (Stampabile item : stampabileLibro) {
            item.stampaDettagli();
        }

    }
}
