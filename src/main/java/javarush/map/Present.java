package javarush.map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Present {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Смирновa", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновко", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Смирновий", dateFormat.parse("APRIL 1 2012"));
        map.put("Смирново", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смирнови", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнове", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнову", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирновка", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Смирновки", dateFormat.parse("JANUARY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(entry -> {
                    int month = entry.getValue().getMonth();
                    return month >= 5 && month <=7;
                });
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        System.out.println(map);
        System.out.println("size: " + map.size());

        removeAllSummerPeople(map);
        System.out.println("-----------------------------------");
        System.out.println(map);
        System.out.println("size: " + map.size());
    }
}
