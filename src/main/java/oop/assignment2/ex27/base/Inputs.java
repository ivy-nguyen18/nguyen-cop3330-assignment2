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
        if(s.equals(" ")){
            return false;
        }
        return s.length() > 0;
    }

    public boolean validateNameLength(String s){
        return s.length() >= 2;
    }

    public boolean validateEmployeeID(){
        return employeeID.matches("^([A-Z]){2}-[\\d]{4}$");
        /*char [] s = employeeID.toCharArray();
        if( Character.isLetter(s[0]) && Character.isLetter(s[1]) && ('-' == s[2])){
            return Character.isLetter(s[3]) && Character.isLetter(s[4]) && Character.isLetter(s[5]);
        }
        return false;*/
    }

    public boolean validateZipCode(){
        return zipCode.chars().allMatch(Character::isDigit);
    }

    public StringBuilder validateInput(){
        StringBuilder output = new StringBuilder();
        int flag = 0;
        if(!validateNameLength(firstName)){
            output.append("The first name must be at least 2 characters long.\n");
            flag = 1;
        }
        if(!validateNameLength(lastName) ){
            output.append("The first name must be at least 2 characters long.\n");
            flag = 1;
        }
        if(!validateName(firstName)){
            output.append("The first name must be filled in.\n");
            flag = 1;
        }
        if(!validateName(lastName)){
            output.append("The last name must be filled in.\n");
            flag = 1;
        }
        if(!validateEmployeeID()){
            output.append("The employee ID must be in the format of AA-1234.\n");
            flag = 1;
        }
        if(!validateZipCode()){
            output.append("The ZIP code must be 5 digit integer.\n");
            flag = 1;
        }
        if(flag == 0){
            StringBuilder output1 = new StringBuilder();
            return output1.append("There were no errors found.");
        }
        return output;
    }
}
