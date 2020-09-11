package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 =new Car(4,2);
        car1.raspechatka();
        car1.zvuk("wwwwww " ,3);

        Tayota tayota1 =new Tayota(6,3,"mark2",2001, new Pricep(1000),Color.KRASNYI);
        tayota1.raspechatka();
        tayota1.zvuk("mmmmm " ,1);
        Tayota tayota2 =new Tayota(5,1,"mark",2005, new Pricep(1500),Color.SINIY);
        tayota2.raspechatka();
        tayota2.zvuk("vvvvv ",4);

    }
}
