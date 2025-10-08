package stepik.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {
    public static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args) {
        try {
            System.out.println(divide(0, Integer.parseInt("f")));
        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE,
                    "Переданный аргумент не может быть передан!", e); // с стек-трейсом
        }

        try {
            System.out.println(divide(0, null));
        } catch (NullPointerException e) {
            LOGGER.log(Level.SEVERE,
                    "Аргумент не может быть null"); // без стек-трейса, только само сообщение
        }

        System.out.println(divide(0, 5));
    }

    public static double divide(Integer a, Integer b) {
        LOGGER.log(Level.FINE,
                "Операция {0}/{1}", new Object[]{a, b}); // FINE - описание до мелочей
        double result = 0.0;
        try {
            result = (double) a/b;
        } catch (Exception e) {
            LOGGER.warning("Что-то пошло не так!");
        }
        LOGGER.log(Level.FINE,
                "Успешно выполнено!");
        return result;
    }
}
