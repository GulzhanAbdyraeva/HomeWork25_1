package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarsData> namesAndPassportOfNumber = new HashMap<>(Map.of(
       new Car(12657845,"ABC12-23"),
       new CarsData(2015,"Honda",250000,"Black"),
       new Car(23114533,"ABC12-24"),
       new CarsData(2016,"Mercedes",260000,"White"),
       new Car(12313411,"ABC12-25"),
       new CarsData(2017,"Toyota",270000,"Blue"),
       new Car(35532112,"ABC12-26"),
       new CarsData(2018,"Fit",280000,"Red")));

        for (Map. Entry a: namesAndPassportOfNumber.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
