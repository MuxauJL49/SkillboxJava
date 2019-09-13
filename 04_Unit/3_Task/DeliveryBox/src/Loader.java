import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        ArrayList<Truck> trucksPark = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int amountBoxes = scanner.nextInt();
        int numberBox = 1;

        //create trucks and fill in
        while (amountBoxes > 0) {
            Truck tmpTruck = new Truck();
            trucksPark.add(tmpTruck);
            numberBox = tmpTruck.fillInTruck(amountBoxes, numberBox);
            amountBoxes = (numberBox == -1) ? (-1) : (amountBoxes - tmpTruck.getMaxBoxesInTruk());
        }

        //print information about trucks
        numberBox = 1;
        for (Truck truck : trucksPark) {
            System.out.println("Truck " + (trucksPark.indexOf(truck) + 1));
            //Condition: there are container and first box exist
            for (int container = 0; (container < truck.getMaxContainers()) && (truck.getNumberBox(container, 0) > 0); container++) {
                System.out.println("\tContainer " + (container + 1));
                for (int box = 0; box < truck.getMaxBoxsesInContainer(); box++) {
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
