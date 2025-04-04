package javarush.statics.nonstatic_static;

public class Person_nnST {
    int height;
}

class Person_ST {
    static int height;
}

class Test {
    public static void main(String[] args) {
        Person_nnST oleg = new Person_nnST();
        oleg.height = 178;
        Person_nnST pavel = new Person_nnST();
        pavel.height = 181;
        System.out.println("height non static: Oleg = " + oleg.height + ", Pavel = " +pavel.height);

        Person_ST olegNew = new Person_ST();
        olegNew.height = 178;
        Person_ST pavelNew = new Person_ST();
        pavelNew.height = 181;
        System.out.println("height static: Oleg = " + olegNew.height + ", Pavel = " +pavelNew.height);
        /***
         * Вывод:
         * Статическая переменная одна для всех. Если ее изменить, то она меняется для каждого обьекта
         *
         * Нестатическая перемення создается для каждого обьекта отдельно
         */
    }
}
