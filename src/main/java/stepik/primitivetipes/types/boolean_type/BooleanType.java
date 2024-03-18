package stepik.primitivetipes.types.boolean_type;

public class BooleanType {
    public static void main(String[] args) {

        // && - (И) - ищет false - коньнкция
        // && - проверяется только начало, если оно равно false
        System.out.println("true && false && true = " + (true && false && true)); //false
        // если начало true, то оно смотрит дальше. На false оно останавливается

        System.out.println("___________________");

        // || - (ИЛИ) - ищет true - дизьюнкция
        System.out.println("true || false = " + (true || false)); //true
        System.out.println("false || true = " + (false || true)); //true
        System.out.println("true || false || true || false = " + (true || false || true || false)); //true

        // && и || / сокращенная схема
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
    }
}