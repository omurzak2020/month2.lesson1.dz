package com.company;

public final class Tayota extends Car {
    private String model;
    private int year;
    private Pricep pricep;
    private Color color;

    public Tayota(int cilindr, int obem, String model, int year, Pricep pricep, Color color) {
        super(cilindr, obem);
        this.model = model;
        this.year = year;
        this.pricep = pricep;
        this.color = color;
    }


    @Override
    public void raspechatka() {
        System.out.println("_________________________________________");
        System.out.println("model  " + model + "\nyear  " + year + "\npripsep " + pricep.getVes() + "\ncolor " + color);

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

    @Override
    public void zvuk(String zvuk, int colich) {
        System.out.println("zvuk " + zvuk);
        System.out.println("Кольичество звук "+ colich);
    }
}
