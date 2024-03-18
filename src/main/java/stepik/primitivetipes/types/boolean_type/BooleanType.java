package stepik.primitivetipes.types.boolean_type;

public class BooleanType {
    public static void main(String[] args) {
        System.out.println("__________&& и || - сокращенная схема______________");
        // && и || - сокращенная схема
        // то есть, cмотрится только c левой части

        // && - (И) - ищет false - коньнкция
        // && - если находится false -> false, дальше обчисления не продолжаются
        System.out.println("true && false && true = " + (true && false && true)); //false
        // если начало true, то оно смотрит дальше. На false оно останавливается

        System.out.println("___________________");

        // || - (ИЛИ) - ищет true - дизьюнкция
        // || - если находится true -> true, дальше обчисления не продолжаются
        System.out.println("true || false = " + (true || false)); //true
        System.out.println("false || true = " + (false || true)); //true
        System.out.println("true || false || true || false = " + (true || false || true || false)); //true

        System.out.println("___________________");

        // ^ - (исключающее ИЛИ)
        // только один true - значит  true, остальное false
        System.out.println("true ^ true = " + (true ^ true)); //false
        System.out.println("false ^ false = " + (false ^ false)); //false
        System.out.println("true ^ false = " + (true ^ false)); //true
        System.out.println("true ^ true ^ false ^ false = " + (true ^ true ^ false ^ false)); //false

        //                        (false) - result
        //                (true)       ^ true
        //          (true)     ^ false
        //    (true)   ^ false
        //true ^ false ^ false ^ false ^ true
        System.out.println("true ^ false ^ false ^ false ^ true = " + (true ^ false ^ false ^ false ^ true)); //false

        System.out.println("\n_________& и | - полная схема______________________");
        // & и | - полная схема
        // то есть, cмотрится и леваяб и парвая части

        // & - смотрится левая и правая часть(если есть false -> false)
        System.out.println("true & false = " + (true & false)); //false
        System.out.println("false & true = " + (false & true)); //false
        System.out.println("true & true = " + (true & true)); //true (false нету)
        System.out.println("false & false = " + (false & false)); //false

        System.out.println("___________________");

        // | - смотрится левая и правая часть(если есть true -> true)
        System.out.println("true | false = "+(true | false)); //true
        System.out.println("false | true = "+(false | true)); //true
        System.out.println("false | false = " + (false | false)); //false (true нету)
        System.out.println("true | true = "+(true | true)); //false
    }
}