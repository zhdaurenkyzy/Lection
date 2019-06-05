package com.company;

public class Freight extends Train {

    private double freight = 90;

    Freight(double power, int countFreightCarriage) {
        super(power, countFreightCarriage);
    }

    public double getFreight() {
        return freight;
    }

    @Override
    public double currentPower() {
        return super.getWeightCarriage() + getFreight();
    }
}
