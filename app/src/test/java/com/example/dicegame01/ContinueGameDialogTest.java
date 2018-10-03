package com.example.dicegame01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContinueGameDialogTest {

    @Test
    public void setContinueGameDialogResult() throws Exception{
        ContinueGameDialog dialog = new ContinueGameDialog();
        Stats stat = new Stats();
        stat.computerScore = 3;
        stat.playerScore = 2;
        stat.roundWinner = "Player";
        dialog.setContinueGameDialogResult(stat);
        int passCount = 0;
        if(dialog.computerResult == stat.computerScore)
        {
            passCount++;
        }
        if(dialog.playerResult == stat.playerScore)
        {
            passCount++;
        }
        if(dialog.gameResult == stat.roundWinner)
        {
            passCount++;
        }
        assertEquals(passCount, 3);
    }
}