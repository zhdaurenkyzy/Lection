package com.company;

public class Passenger extends Train {

    private int numberOfPass;

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    Passenger(double power, int countPassCarriage, int numberOfPass) {
        super(power, countPassCarriage);
        setNumberOfPass(numberOfPass);
    }



    @Override
    public double currentPower() {
        return super.getWeightCarriage() + (getNumberOfPass() * 0.1);
    }

}
