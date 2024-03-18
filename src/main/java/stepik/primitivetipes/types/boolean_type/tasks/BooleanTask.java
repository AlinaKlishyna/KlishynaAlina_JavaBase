package stepik.primitivetipes.types.boolean_type.tasks;

public class BooleanTask {
    public static void main(String[] args) {
       // Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
        System.out.println(booleanExpression(true, true, true, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d){
        //for A
        if ((a & b & !c & !d) | (a & c & !b & !d) | a & d & !b & !c)
            return true;

        //for B
        if ((b & c & !a & !d) | (b & d & !a & !c)) //(b & a & !c & !d) - не нужно, так как есть уже в А
            return true;

        //for C
        if ((c & d & !a & !b))
            return true;

        //for D: не нужно создавать, так как оно повторяется в А, В и С
        return false;
    }
}
