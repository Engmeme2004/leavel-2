package javaapplication16;

import java.util.Arrays;

public class Car {

    String color;
    int id;
    int price;
    Engin[] eng = new Engin[3];
    int count;

    public Car() {
    }

    public Car(String color, int id, int price) {
        this.color = color;
        this.id = id;
        this.price = price;
    }

    public Car(String color, int id, int price, Engin e) {
        this(color, id, price);
        addEngin(e);
    }

    void addEngin(int power, int year) {
        if (ensurecapacity()) {
            eng[count++] = new Engin(power, year);
        } else {
            System.out.println("array is full");
        }
    }

    void addEngin(Engin e) {
        if (ensurecapacity()) {
            eng[count++] = e;
        } else {
            System.out.println("array is full");
        }
    }

    boolean ensurecapacity() {
        return (count < 3);
    }

    double avgpower() {
        int sum = 0;
        double avg;
        if (count == 0) {
            System.out.println("there is no engin");
        }
        for (int i = 0; i < count; i++) {
            sum += eng[i].power;
        }
        return (double) sum / count;

    }

    int[] gemaxtprice(Car[] c) {
        int[] arr = new int[2];
        int max = c[0].price;
        int n = c[0].id;
        for (int i = 0; i < c.length; i++) {
            if (c[i].price > max) {
                max = c[i].price;
                n = c[i].id;
            }

        }
        arr[0] = max;
        arr[1] = n;

        return arr;
    }

    static int countRed(Car[] car) {
        int c = 0;
        for (int i = 0; i < car.length; i++) {
            if ("red".equalsIgnoreCase(car[i].color)) {
                c++;
            }
        }
        return c;

    }

    static void sortByPrice(Car[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].price < arr[j + 1].price) {
                    Car temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    static void sortByyear(Car[] arr) {
        int sum = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].count; j++) {
                sum += arr[i].eng[j].year;
            }
            temp[i] = sum;
        }
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                    Car tempCar = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempCar;
                }
            }

        }

    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", id=" + id + ", price=" + price + ", eng=" + Arrays.toString(eng) + '}';
    }

}
