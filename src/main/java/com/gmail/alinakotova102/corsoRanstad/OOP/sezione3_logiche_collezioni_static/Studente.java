package com.gmail.alinakotova102.corsoRanstad.OOP.sezione3_logiche_collezioni_static;

import java.util.ArrayList;
import java.util.List;

public class Studente {
    List<Voto> voti = new ArrayList<>();

    public void addVoto(Voto voto) {
        if (voto!=null) {
            voti.add(voto);
        }
    }

    public Voto averageVoto() {
        int somma = 0;
        for (Voto voto : voti) {
            somma+=(voto.getFrom() + voto.getTo())/2;
        }

        int average = somma/voti.size();
        if (average>=Voto.A.getFrom() && average<=Voto.A.getTo()) {
            return Voto.A;
        } else if (average>=Voto.B.getFrom() && average<=Voto.B.getTo()) {
            return Voto.B;
        }else if (average>=Voto.C.getFrom() && average<=Voto.C.getTo()) {
            return Voto.C;
        }else if (average>=Voto.D.getFrom() && average<=Voto.D.getTo()) {
            return Voto.D;
        }
        return Voto.F;
    }


    public static void main(String[] args) {
        Studente studente = new Studente();
        studente.addVoto(Voto.A);
        studente.addVoto(Voto.B);
        studente.addVoto(Voto.F);
        System.out.println(studente.averageVoto());
    }
}


enum Voto {
    A(90, 100),
    B(80, 89),
    C(70, 79),
    D(60, 69),
    F(0, 59);

    private int from;
    private int to;

    Voto(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}