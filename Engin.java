
package javaapplication16;

public class Engin {
    int power ; 
    int year ; 

    public Engin() {
    }

    public Engin(int power, int year) {
        this.power = power;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Engin{" + "power=" + power + ", year=" + year + '}';
    }
    
    
    
    
}
