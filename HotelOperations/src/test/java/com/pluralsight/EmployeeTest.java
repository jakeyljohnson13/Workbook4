package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {
    //arrange
    Employee emp = new Employee(1,"John","HR",30.0,0.0);

    @Test
    void punchIn() {
        //act
        emp.punchIn(10.0);
        //assert
        double expected = 10.0;
        double actual = emp.timeIn;
        assertEquals(expected,actual);
    }

    @Test
    void punchOut() {
        //act
        emp.setHoursWorked(32.0);
        emp.punchIn(10.0);
        emp.punchOut(18.0);
        double expectedPunch = 18.0;
        double actualPunch = emp.timeOut;
        //assert
        assertEquals(expectedPunch,actualPunch);
        //act
        double expectedDayHours = 8.0;
        double actualDayHours = emp.hoursOfDay;
        double expectedTotalHours = 40.0;
        double actualTotalHours = emp.getHoursWorked();
        //assert
        assertEquals(expectedDayHours,actualDayHours);
        assertEquals(expectedTotalHours,actualTotalHours);

    }
}