package com.company;

public class Car extends Transport{
    private int obem;

    public Car(int cilindr,int obem) {
        super(cilindr);
        this.obem = obem;
    }


    public int getObem() {
        return obem;
    }


    public final void zvuk(String zvuk){
        System.out.println("звук из выхлопа " + zvuk);
    }
    public void zvuk(String zvuk,int colich){
        System.out.println("звук из выхлопа " + zvuk);
        System.out.println("кольичество звук " + colich);
    }
    public void raspechatka(){
        System.out.println("slindir"+ obem);
    }

}
