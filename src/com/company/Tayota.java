package com.company;

public final class Tayota extends Car {
    private String model;
    private int year;
    private Pricep pricep;
    private Color color;

    public Tayota(int cilindr, int obem, String model, int year, Pricep pricep) {
        super(cilindr);
        this.model = model;
        this.year = year;
        this.pricep = pricep;
        chooseColor();
    }

    public void method(Tayota tayota) {
        pricep = tayota.pricep;
        year = tayota.year;
        color = tayota.color;
    }

    public void chooseColor() {
        switch (random()) {
            case 0 -> color = Color.black;
            case 2 -> color = Color.brown;
            case 3 -> color = Color.Gray;
            case 4 -> color = Color.green;
            case 5 -> color = Color.white;
            case 6 -> color = Color.yellow;
            case 1 -> color = Color.grey;
            default -> System.out.println("Нет свет машины ");
        }
    }

    @Override
    public void raspechatka() {
        System.out.println("_________________________________________");
        System.out.println("Модель машины  " + model +
                "\nyear  " + year +
                "\nРазришена для Припсепа  " + pricep.getVes() + "кг " + "\ncolor " + color);

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Pricep getPricep() {
        return pricep;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void zvuk(String zvuk, int colich) {
        System.out.println("Звук: " + zvuk);
        System.out.println("Кольичество звук: " + colich);
    }
}
