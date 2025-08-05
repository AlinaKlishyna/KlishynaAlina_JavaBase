package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi8_10;

import java.util.HashMap;
import java.util.Map;

public interface File {
    void readFile();
}

class Documento implements File {

    @Override
    public void readFile() {
        System.out.println("Reading..");
    }
}

class Archivio {
    Map<Integer, Documento> map = new HashMap<>();
}
