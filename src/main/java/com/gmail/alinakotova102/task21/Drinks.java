package com.gmail.alinakotova102.task21;

enum Drinks {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL("Mineral"),
    COCA_COLA("Coca-cola"),
    UNKNOWN();

    private final String name;

    Drinks() {
        this.name = "UNKNOWN";
    }

    Drinks(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void menu() {
        int i = 1;
        for (Drinks drinks : Drinks.values()) {
            if (drinks != UNKNOWN) {
                System.out.println(i + " - " + drinks.getName() + " - " + DrinksMachine.getPrice(drinks) + "$");
                DrinksMachine.composition(drinks);
                i++;
            }
        }
    }

    public static Drinks select(int number) {
        Drinks drink = null;
        int i = 1;
        for (Drinks drinks : Drinks.values()) {
            if (i == number) {
                drink = drinks;
            }
            i++;
        }
        return drink;
    }
}