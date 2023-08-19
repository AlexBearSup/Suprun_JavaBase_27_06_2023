package ua.hillel.suprun.homeworks.homework17;



public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    SODA("Мінералка"),
    COLA("Кока Кола");

    private String type;

    DrinksMachine(String type) {

        this.type = type;
    }
    public String getType() {

        return type;
    }

}
