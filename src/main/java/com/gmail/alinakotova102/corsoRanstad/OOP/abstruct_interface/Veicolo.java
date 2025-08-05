package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

//абстрактный класс почти такой же как и обычный, его можно наследовать
// но разница в том что его абстрактные методы обязательно экспортировать
//от такого класса можно построить иерархию
// тело абстрактного метода не заполняем, но можем так же использовать обычные(например getter()/setter())

// от интерфейса мы не можем наследоваться, хотя можем через полиморфизм через создание массива классов которые его реализуют
// не можем от интерфейса наследоваться
// в интерфейсе так же как и в абстрактном метода нельзя иметь тело метода
// так же имплементировать интерфейс можно много раз, а расширять клас только 1
public abstract class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public abstract void avvia();

    public abstract void dettagliVeicolo();

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}

class Auto extends Veicolo {
    public Auto(String marca, String modello) {
        super(marca, modello);
    }

    @Override
    public void avvia() {
        System.out.println("Start!");
    }

    @Override
    public void dettagliVeicolo() {
        System.out.println(this.getClass().getSimpleName() + ": " + getMarca() + ", " + getModello());
    }
}