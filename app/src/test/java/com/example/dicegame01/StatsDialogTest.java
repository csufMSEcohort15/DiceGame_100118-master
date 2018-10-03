package com.example.dicegame01;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StatsDialogTest {

    @Test
    public void setRoundResults() throws Exception{
        Stats stat1 = new Stats();
        Stats stat2 = new Stats();
        Stats stat3 = new Stats();
        ArrayList<Stats> list = new ArrayList<Stats>();
        list.add(stat1);
        list.add(stat2);
        list.add(stat3);
        StatsDialog sd = new StatsDialog();
        sd.setRoundResults(list);
        int expectedOutput = 3;
        int output = sd.roundResults.size();

        assertEquals(expectedOutput, output);

    }
}