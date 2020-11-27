package com.company;

import java.util.Random;

public class Car extends Transport{
    private int year;
    private int obem;
    private String sportcar;
    private Color color;

    public Car( int cilindr, int year, int obem, String sportcar) {
        super(cilindr);
        this.year = year;
        this.obem = obem;
        this.sportcar = sportcar;
        chooseColor();




    }

    public Car(int cilindr) {
        super(cilindr);
    }

    public int getObem() {
        return obem;
    }

    public String getSportcar() {
        return sportcar;
    }

    public int getYear() {
        return year;
    }

    public static void ran(){

    }
    public int random(){
        Random r = new Random();
        return r.nextInt(6);
    }


    public final void zvuk(String zvuk){
        System.out.println("звук из выхлопа: " + zvuk);
    }


    public void zvuk(String zvuk,int colich){
        System.out.println("звук из выхлопа: " + zvuk);
        System.out.println("кольичество звук: " + colich);
    }
    public void raspechatka(){
        System.out.println("Названия машины: " + sportcar+
                "\nГод выпуска машина: "+ year+
                "\nОбьем: "+ obem+
                "\nцилиндр: "+ getCilindr()+
                "\ncolor " + color);
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

}
