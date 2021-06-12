package oop.assignment2.ex39.base;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return separationDate;
    }
}
