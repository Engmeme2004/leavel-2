package javaapplication17;

import java.util.Date;

public class Employee extends Person {

    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String office, int salary, Date dateHired, String name, String adress, String emailAdress, int phoneNumber, Date birthDate) {
        super(name, adress, emailAdress, phoneNumber, birthDate);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Employee temp = (Employee) obj;
        if (this.getName() != null && this.getName().equalsIgnoreCase(temp.getName()) && this.salary == temp.salary) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + ", office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }

}
