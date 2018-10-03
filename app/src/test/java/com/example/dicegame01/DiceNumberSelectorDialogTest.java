package com.example.dicegame01;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceNumberSelectorDialogTest {

    @Test
    public void getFirstDieRolled() throws Exception{
        DiceNumberSelectorDialog dialog = new DiceNumberSelectorDialog();
        int exampleRoll = 5;
        dialog.firstDieRolled = exampleRoll;
        int outcome = dialog.getFirstDieRolled();
        assertEquals(exampleRoll, outcome);
    }

    @Test
    public void setFirstDieRolled() throws Exception{
        DiceNumberSelectorDialog dialog = new DiceNumberSelectorDialog();
        int exampleRoll = 2;
        dialog.setFirstDieRolled(exampleRoll);
        int outcome = dialog.firstDieRolled;
        assertEquals(exampleRoll, outcome);
    }
}