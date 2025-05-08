package com.gmail.alinakotova102.drafts.reference_method.task3;

public class Runner {
    public static void main(String[] args) {
        Text object = new Text();

        //Интерфейсные переменные
        Delta delta = Text::setMessage;
        Alfa alfa = Text::display;
        Zeta zeta = Text::show;

        //Вызов методов
        object.setMessage("Hello World!");
        alfa.alfa(object);
        delta.delta(object, "Delta!");
        object.display();
        zeta.zeta("Zeta!");
    }
}
