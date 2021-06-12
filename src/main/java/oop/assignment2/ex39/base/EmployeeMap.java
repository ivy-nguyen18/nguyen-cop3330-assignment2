package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

    private final Map<String, Employee> employeeMap;

    public EmployeeMap(Map<String, Employee> employeeMap){
        this.employeeMap = employeeMap;
    }

    private Map<String, Employee> initializeEmployees() {

        Employee e1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee e2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee e3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee e4 = new Employee("Jake", "Jacobson", "Programmer", "");
        Employee e5 = new Employee("Jaquelin", "Jackson", "DBA", "");
        Employee e6 = new Employee("Sally", "Webber", "Web Development", "2015-12-18");

        employeeMap.put(e1.getLastName(), e1);
        employeeMap.put(e2.getLastName(), e2);
        employeeMap.put(e3.getLastName(), e3);
        employeeMap.put(e4.getLastName(), e4);
        employeeMap.put(e5.getLastName(), e5);
        employeeMap.put(e6.getLastName(), e6);

        return employeeMap;
    }

    private ArrayList<String> sortByKey(){
        initializeEmployees();
        ArrayList<String> sortedKeys = new ArrayList<>(employeeMap.keySet());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }

    public void printSortedMap (Map<String, Employee> employeeMap){
        ArrayList<String> sortedKeys = sortByKey();
        String dash = "-";
        System.out.printf("%-20s|%-20s|%-20s\n", "Name", "Position", "Separation Date");
        System.out.println(dash.repeat(20) + "|" + dash.repeat(20) + "|" + dash.repeat(20));
        for(String x: sortedKeys){
            System.out.println(String.format("%-20s",employeeMap.get(x).getFullName())+ "|" +
                    String.format("%-20s",employeeMap.get(x).getPosition() )+ "|" +
                    String.format("%-20s",employeeMap.get(x).getSeparationDate() )
            );
        }
    }
}
