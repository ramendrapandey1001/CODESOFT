package StudentManagementSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private Integer rollNumber;
    private String firstName;
    private String lastName;
    private Integer grade;
    private String birthdayDate;
    private Long phoneNumber;
    private String emailID;
    private String address;

    public Student() {

    }

    public Student(Integer rollNumber, String firstName, String lastName, Integer grade, String birthdayDate, Long phoneNumber, String emailID, String address) {

        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
        this.address = address;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", birthdayDate=" + birthdayDate +
                ", phoneNumber=" + phoneNumber +
                ", emailID='" + emailID + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
