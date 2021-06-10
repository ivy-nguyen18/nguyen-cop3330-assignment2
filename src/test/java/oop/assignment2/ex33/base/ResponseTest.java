package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTest {

    @Test
    void random_response_generates_one_of_four_outputs() {
        Response response = new Response();

        String actual = response.randomResponse();
        List<String> expected = List.of("Yes", "No", "Maybe", "Ask Again Later");

        for(int i = 0; i < 4; i++){
            assertEquals(actual,expected.get(i));
        }

    }

}