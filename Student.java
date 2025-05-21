package javaapplication17;

import java.util.Date;

public class Student extends Person {

    private String department;
    private String classStatus;

    public Student() {
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public String getDepartment() {
        return department;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public Student(String department, String classStatus, String name, String adress, String emailAdress, int phoneNumber, Date birthDate) {
        super(name, adress, emailAdress, phoneNumber, birthDate);
        this.department = department;
        this.classStatus = classStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Student temp = (Student) obj;
        if (this.classStatus != null && this.getName().equalsIgnoreCase(temp.getName()) && this.classStatus.equalsIgnoreCase(temp.classStatus)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + getName() + ", address=" + getAdress() + ", email=" + getEmailAdress() + ", phoneNumber=" + getPhoneNumber() + ", birthDate=" + getBirthDate() + ", department=" + department + ", classStatus=" + classStatus + '}';
    }

}
