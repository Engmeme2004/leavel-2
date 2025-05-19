package javaapplication16;

import java.util.Arrays;

public class JavaApplication16 {

    public static void main(String[] args) {
        Engin e1 = new Engin(1000, 2020);
        Engin e2 = new Engin(100, 2012);
        Engin e3 = new Engin(900, 1958);
        Engin e4 = new Engin(1010, 2020);

        Car c[] = new Car[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Car("Red", 10 * i, 100 * i + 1);
            for (int j = 0; j < c.length; j++) {
                c[i].addEngin(new Engin(1000 * (j + 1), 2000 + j));
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(Car.countRed(c));
        Car.sortByyear(c);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(); // or system.out.print (Arrays.tostring(c)) ; 
    }

}
