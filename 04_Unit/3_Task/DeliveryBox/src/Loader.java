import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        ArrayList<Truck> trucksPark = new ArrayList<Truck>();
        Scanner scanner = new Scanner(System.in);
        int amountBoxes = scanner.nextInt();
        int numberTruck = 0;
        int numberBox = 1;

        //create trucks and fill in
        while ((amountBoxes - numberBox) > 0) {
            Truck tmpTruck = new Truck();
            trucksPark.add(tmpTruck);
            numberBox = tmpTruck.fillInTruck(amountBoxes, numberBox);
            if (numberBox == -1) {
                amountBoxes = -1;
            }
        }

        //print information about trucks
        numberBox = 1;
        for (Truck truck : trucksPark) {
            System.out.println("Truck " + (trucksPark.indexOf(truck) + 1));
            for (int container = 0; container < truck.getMaxContainers(); container++) {
                if (numberBox < 0) {
                    break;
                }
                System.out.println("\tContainer " + (container + 1));
                for (int box = 0; box < truck.getMaxBoxses(); box++) {
                    numberBox = truck.getNumberBox(container, box);
                    if (numberBox < 0) {
                        break;
                    }
                    System.out.println("\t\tBox " + numberBox);
                }
            }
        }


    }
}
