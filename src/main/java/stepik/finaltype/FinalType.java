package stepik.finaltype;

public final class FinalType {  //обьявление класса - не имеет наследников
    final int t = 0;    //обьявление локальной переменной - нельзя изменить
    final int t2 = 0;   //обьявление статической локальной переменной

    public final void method(final int t){    //обьявление метода и параметра метода - нельзя overriding

    }

    public  FinalType(){  //нельзя добавить в конструктор!

    }
}
