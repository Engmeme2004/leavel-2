package javaapplication17;

import java.util.Date;

public class Faculty extends Employee {

    private String rank;
    private int officeHours;

    public Faculty(String rank, int officeHoures, String office, int salary, Date dateHired, String name, String adress, String emailAdress, int phoneNumber, Date birthDate) {
        super(office, salary, dateHired, name, adress, emailAdress, phoneNumber, birthDate);
        this.rank = rank;
        this.officeHours = officeHoures;
    }

    public Faculty() {
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setOfficeHoures(int officeHoures) {
        this.officeHours = officeHoures;
    }

    public String getRank() {
        return rank;
    }

    public int getOfficeHoures() {
        return officeHours;
    }

@Override
public String toString() {
    return "Faculty{" + super.toString() +
           ", rank=" + rank +
           ", officeHours=" + officeHours + '}';
}

}
