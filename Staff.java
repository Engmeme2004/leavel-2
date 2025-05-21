package javaapplication17;

import java.util.Date;

public class Staff extends Employee {

    private String title;

    public Staff() {
    }

    public Staff(String title, String office, int salary, Date dateHired, String name, String adress, String emailAdress, int phoneNumber, Date birthDate) {
        super(office, salary, dateHired, name, adress, emailAdress, phoneNumber, birthDate);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + super.toString() + '}';
    }

}
