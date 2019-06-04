package com.company;

public class Train {

    private double power;
    private int countCarriage;
    private double weightCarriage;
    private double weightLocomotive;
    final static double a = 10.2;


    Train(double power, int countCarriage) {
        this.power = power;
        this.countCarriage = countCarriage;
    }

    public double getPower() {
        return power;
    }

    public int getCountCarriage() {
        return countCarriage;
    }

    public double getWeightCarriage() {
        return weightCarriage;
    }

    public double getWeightLocomotive() {
        return weightLocomotive;
    }

    public void setWeightCarriage(double weightCarriage) {
        this.weightCarriage = weightCarriage;
    }

    public void setWeightLocomotive(double weightLocomotive) {
        this.weightLocomotive = weightLocomotive;
    }

    public double currentPower() {
        return (getWeightCarriage() * a * getCountCarriage()) + a * getWeightLocomotive();
    }

    public void toPullCarriage() {
        if (currentPower() > getPower()) {
            System.out.println("Нет тяги, кол-во вагонов превышает допустимое значение");
        } else if (currentPower() <= getPower()) {
            int maxCountCarriage = (int) ((getPower() - (getWeightLocomotive() * a)) / (getWeightCarriage() * a));
            int addCountCarriage = maxCountCarriage - getCountCarriage();
                if (addCountCarriage == 0) {
                    System.out.println("Есть тяга, максимальное кол-во вагонов: " + getCountCarriage());
                } else
                     System.out.println("Есть тяга, можно добавить еще " + addCountCarriage);
        }
    }
}
