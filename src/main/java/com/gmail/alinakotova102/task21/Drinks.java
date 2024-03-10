package com.gmail.alinakotova102.task21;

enum Drinks {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL("Mineral"),
    COCA_COLA("Coca-cola");

    private final String name;

    Drinks(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
