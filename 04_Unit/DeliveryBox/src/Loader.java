import java.util.ArrayList;
import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        ArrayList<Truck> trucksPark  = new ArrayList<Truck>();
        Scanner scanner = new Scanner(System.in);
        int amountBoxes = scanner.nextInt();
        int numberTruck = 0;
        int numberBox = 1;

        //create trucks and fill in
        while ((amountBoxes - numberBox) > 0){
            trucksPark.add(new Truck());
            numberBox = trucksPark.get(numberTruck).fillInTruck(amountBoxes, numberBox);
            if(numberBox == -1){
                amountBoxes = -1;
            }
        }

        //print information about trucks
        for(Truck truck: trucksPark){
            System.out.println("Truck " + (trucksPark.indexOf(truck) + 1));
            for(int container = 0; container < truck.getMAX_CONTAINERS(); container++){
                System.out.println("\tContainer " + (container + 1));
                for(int box = 0; box < truck.getMAX_BOXES(); box++){
                    numberBox = truck.getNumberBox(container, box);
                    if(numberBox < 0){
                        break;
                    }
                    System.out.println("\t\tBox " + numberBox);
                }
            }
        }


    }
}
