package com.gmail.alinakotova102.drafts.reference_method.task2;

public class Runner {
    public static void main(String[] args) {
        //Создание обьекта
        Cat kotik = new Cat();

        //Интерфейсные переменные и ссылки на методы
        //внутри автоматически создается обьект анонимного класса
        Delta deltaColor = kotik::setColor; //является лямбда-выражением (String t) -> kotik.set(t);
        Delta deltaName = kotik::setName;
        Service service = kotik::show; ////является лямбда-выражением () -> kotik.show();

        //Вызов методов
        deltaName.apply("Boris");
        deltaColor.apply("Черный");
        service.display();

        deltaName.apply("Шарик");
        deltaColor.apply("Белый");
        service.display();

        //Создание нового обьекта
        kotik = new Cat();
        kotik.setName("Василиска");
        kotik.setColor("Трехцветка");
        //service.display(); - он продолжит работать, даже если мы изменили адрес ссылки kotik и выведет старое значение
        kotik.show();
    }
}
