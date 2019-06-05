package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 1-Пассажирский/ 2-Грузовой: ");
        while(true){
        int trainType = sc.nextInt();
            if((trainType<1)||(trainType>=3)) {
                System.out.println("Введите еще раз");
                continue;
            }
        System.out.println("Введите мощность, кН:");
        double power = sc.nextDouble();
        System.out.println("Введите кол-во вагонов");
        int count = sc.nextInt();
        }
        if (trainType == 1) {
            System.out.println("Введите кол-во пассажиров");
            int people = sc.nextInt();
            Passenger passenger = new Passenger(power, count,people);
            passenger.setWeightCarriage(20);
            passenger.setWeightLocomotive(150);
            passenger.toPullCarriage();
        }

        else if (trainType == 2) {
            Freight freight = new Freight(power, count);
            freight.setWeightCarriage(28);
            freight.setWeightLocomotive(200);
            freight.toPullCarriage();
        }
    }
}

