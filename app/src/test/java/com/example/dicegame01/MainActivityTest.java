package com.example.dicegame01;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void calcModSum() throws Exception {
        int dice1 = 5;
        int dice2 = 4;
        int output;
        int expectedOutput = 3;
        MainActivity activity = new MainActivity();
        output = activity.CalcModSum(dice1, dice2);
        assertEquals(expectedOutput, output);
    }
}