package carHomework;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Si bien de esta forma no uso setters, cre que es una buena opcion
        Car honda = new Car("HRV", "RED", 1992);
        Car ford = new Car("F100","BLUE", 2002);
        Car chevrolet = new Car("CRUZE", "BLACK",2022);

        Car[] cars = new Car[3];
        cars[0] = honda;
        cars[1] = ford;
        cars[2] = chevrolet;

        for (Car carName: cars
             ) {
            if (carName == honda){
                System.out.println("Honda:");
            } else if (carName == chevrolet){
                System.out.println("Chevrolet:");
            } else{
                System.out.println("Ford:");
            }
            carName.getModel();
            carName.getColor();
            carName.getYear();
            carName.start();
            carName.running();
            carName.setGearBox(6);
            carName.getGearBox();
            carName.stop();
            System.out.println();
        }

    }
}
