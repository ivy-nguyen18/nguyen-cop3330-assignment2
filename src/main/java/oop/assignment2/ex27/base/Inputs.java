/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex27.base;

public class Inputs {
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    public Inputs(String firstName, String lastName, String zipCode, String employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    public boolean validateName(String s){
        return s.equals(" ");
    }

    public boolean validateNameLength(String s){
        return s.length() >= 2;
    }

    public boolean validateEmployeeID(){
        //return employeeID.matches("^([A-Za-z]){2}-([0-9]){4}$");
        char [] s = employeeID.toCharArray();
        if( Character.isLetter(s[0]) && Character.isLetter(s[1]) && ('-' == s[2])){
            return Character.isLetter(s[3]) && Character.isLetter(s[4]) && Character.isLetter(s[5]);
        }
        return false;
    }

    public boolean validateZipCode(){
        return zipCode.chars().allMatch(Character::isDigit);
    }

    public StringBuilder validateInput(){
        StringBuilder output = new StringBuilder();
        int flag = 0;
        if(!validateName(firstName)){
            output.append("The first name must be filled in\n");
            flag = 1;
        }
        if(!validateNameLength(firstName) && validateName(firstName)){
            output.append(String.format("\"%s\" ", firstName) + "is not a valid first name. It is too short.\n");
            flag = 1;
        }
        if(!validateName(lastName)){
            output.append("The last name must be filled in\n");
            flag = 1;
        }
        if(!validateNameLength(lastName) && validateName(lastName)){
            output.append(String.format("\"%s\" ", lastName) + "is not a valid last name. It is too short.\n");
            flag = 1;
        }
        if(!validateZipCode()){
            output.append("The ZIP code must be numeric.\n");
            flag = 1;
        }
        if(!validateEmployeeID()){
            output.append(employeeID + " is not a valid ID.\n");
            flag = 1;
        }
        if(flag == 0){
            StringBuilder output1 = new StringBuilder();
            return output1.append("There were no errors found.");
        }
        return output;
    }
}
