package com.nguyen.hien.powerball.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "PowerballDraws")
public class PowerballDraw {

    @Id
    private int Draw;

    private Date DrawDate;

    private List<Integer> WinningNumbers;

    private int PowerNumber;

    public PowerballDraw() {
    }

    public int getDraw() {
        return Draw;
    }

    public void setDraw(int draw) {
        Draw = draw;
    }

    public Date getDrawDate() {
        return DrawDate;
    }

    public void setDrawDate(Date drawDate) {
        DrawDate = drawDate;
    }

    public List<Integer> getWinningNumbers() {
        return WinningNumbers;
    }

    public void setWinningNumbers(List<Integer> winningNumbers) {
        WinningNumbers = winningNumbers;
    }

    public int getPowerNumber() {
        return PowerNumber;
    }

    public void setPowerNumber(int powerNumber) {
        PowerNumber = powerNumber;
    }
}
