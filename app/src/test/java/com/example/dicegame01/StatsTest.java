package com.example.dicegame01;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatsTest {

    @Test
    public void getComputerScore() throws Exception{
        Stats stat = new Stats();
        int examplecomputerScore = 6;
        stat.computerScore = examplecomputerScore;
        int outcome;
        outcome = stat.getComputerScore();
        assertEquals(examplecomputerScore, outcome);
    }

    @Test
    public void setComputerScore() throws Exception{
        Stats stat = new Stats();
        int examplecomputerScore = 4;
        stat.setComputerScore(examplecomputerScore);
        int outcome = stat.computerScore;
        assertEquals(examplecomputerScore, outcome);
    }

    @Test
    public void getPlayerScore() throws Exception{
        Stats stat = new Stats();
        int exampleplayerScore = 5;
        stat.playerScore = exampleplayerScore;
        int outcome = stat.getPlayerScore();
        assertEquals(exampleplayerScore, outcome);
    }

    @Test
    public void setPlayerScore() throws Exception{
        Stats stat = new Stats();
        int exampleplayerScore = 3;
        stat.setPlayerScore(exampleplayerScore);
        int outcome = stat.playerScore;
        assertEquals(exampleplayerScore, outcome);
    }

    @Test
    public void getRoundWinner() throws Exception{
        Stats stat = new Stats();
        String exampleroundWinner = "Player";
        stat.roundWinner = exampleroundWinner;
        String outcome = stat.getRoundWinner();
        assertEquals(exampleroundWinner, outcome);
    }

    @Test
    public void setRoundWinner() throws Exception{
        Stats stat = new Stats();
        String exampleroundWinner = "Computer";
        stat.setRoundWinner(exampleroundWinner);
        String outcome = stat.roundWinner;
        assertEquals(exampleroundWinner, outcome);
    }
}