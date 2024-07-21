package stepik.exception.getclassmethod;

public class HotSpotMethod {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        another();
        another2();
    }

    public static void another() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void another2() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] threads = Thread.currentThread().getStackTrace();
        return threads[2].getMethodName().equals("main") ? threads[2].getClassName() + "#" + threads[2].getMethodName() : null;
    }
}

//threads[i].getClassName() + "#" + threads[i].getMethodName();