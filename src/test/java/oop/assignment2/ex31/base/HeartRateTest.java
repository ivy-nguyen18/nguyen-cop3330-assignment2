package oop.assignment2.ex31.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    @DisplayName("Intensity: 55")
    void target_heartrate_returns_correct_target_rate_for_intensity1() {
        HeartRate heartRate = new HeartRate(65, 22);

        double expected = 138.00;
        double actual = heartRate.targetHeartRate(55/100.0);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Intensity: 60")
    void target_heartrate_returns_correct_target_rate_for_intensity2() {
        HeartRate heartRate = new HeartRate(65, 22);

        double expected = 145.00;
        double actual = heartRate.targetHeartRate(60/100.0);

        assertEquals(expected,actual);
    }
}