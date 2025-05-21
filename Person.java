package javaapplication17;

import java.util.Date;

public class Person {

    private String name;
    private String adress;
    private String emailAdress;
    private int phoneNumber;
    private Date birthDate;

    public Person() {
    }

    public Person(String name, String adress, String emailAdress, int phoneNumber, Date birthDate) {
        this.name = name;
        this.adress = adress;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", adress=" + adress + ", emailAdress=" + emailAdress + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + '}';
    }
    
}


