package com.example.dicegame01;

public class Stats
{
    public int computerScore;
    public int playerScore;
    public String roundWinner;

    public Stats()
    {
        computerScore = 0;
        playerScore = 0;
        roundWinner = "";
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public String getRoundWinner() {
        return roundWinner;
    }

    public void setRoundWinner(String roundWinner) {
        this.roundWinner = roundWinner;
    }


}
