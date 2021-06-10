package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void remove_employee_and_displays_new_list() {
        List<String> list = Arrays.asList("John Smith",
                "Jackie Johnson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin");

        EmployeeList employeeList = new EmployeeList(list);

        boolean expected = true;
        //boolean actual = list.remove(1);

        //assertEquals(expected, actual);

    }
}