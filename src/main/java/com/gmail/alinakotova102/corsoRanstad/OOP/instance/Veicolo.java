package com.gmail.alinakotova102.corsoRanstad.OOP.instance;

public class Veicolo {
    public String getInfo() {
        return "Veicolo";
    }
}

class Auto extends Veicolo {
    @Override
    public String getInfo() {
        return super.getInfo() + ": " + Auto.class.getName();
    }

    public boolean girareGomme() {
        return true;
    }
}

class Bicicletta extends Veicolo {
    @Override
    public String getInfo() {
        return super.getInfo() + ": " + Bicicletta.class.getName();
    }

    public boolean girareRuote() {
        return true;
    }
}
