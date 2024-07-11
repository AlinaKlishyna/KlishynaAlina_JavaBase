package stepik;

public class Case {
    public static void main(String[] args) {
        //caseSwitch("1");

        for (int i = 0; i < 100; ) {
            // тело цикла
            System.out.println(i);
            i++;
            
        }
    }

    public static void caseSwitch(String test) {
        switch (test) {
            case "0":
                System.out.println("0");
                break;
            case "1":
                System.out.println("1");
            case "2":
                System.out.println("2");
        }
    }
}
