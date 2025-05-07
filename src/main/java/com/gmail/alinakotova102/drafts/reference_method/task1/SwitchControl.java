package com.gmail.alinakotova102.drafts.reference_method.task1;

import com.gmail.alinakotova102.drafts.reference_method.task1.Lamp;

public class SwitchControl {
    public static void main(String[] args) {
        Lamp myLampochka = new Lamp();
        myLampochka.turnOn(); // типичный вызов метода класса

        //используем ссылку на метод
        //мы не вызываем метод сразу, а чтобы использовать ПОТОМ(когда это нужно)
        Runnable turnOnMethod = myLampochka::turnOn; //myLampochka::turnOn - это и есть ссылка на метод(обьект::метод)
        turnOnMethod.run();

        //референс метод - это способ передать метод как аргумент другому методу
    }
}
