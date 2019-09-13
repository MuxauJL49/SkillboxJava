
public class Truck {
    private final int maxContainers;
    private final int maxBoxses;

    private int[][] listBoxesInTruck;

    public Truck() {
        maxContainers = 12;
        maxBoxses = 27;
    }

    public Truck(int container, int boxes) {
        maxContainers = container;
        maxBoxses = boxes;
        if (boxes <= 0 || container <= 0) {
            throw new NullPointerException("Error in building a truck.");
        }
    }

    //return number of last box in the truck or -1 if all boxes is loaded and truck isn't filled in.
    public int fillInTruck(int boxes, int numFirstBox) {
        listBoxesInTruck = new int[maxContainers][maxBoxses];
        for (int cont = 0; (cont < maxContainers) && (boxes > 0); cont++) {
            for (int box = 0; (box < maxBoxses) && (boxes > 0); box++) {
                listBoxesInTruck[cont][box] = numFirstBox++;
                boxes--;
            }
        }
        return (boxes == 0) ? (-1) : numFirstBox;
    }


    public int getMaxContainers() {
        return maxContainers;
    }

    public int getMaxBoxsesInContainer() {
        return maxBoxses;
    }

    public int getMaxBoxesInTruk() {
        return maxBoxses * maxContainers;
    }

    public int[][] getListBoxesInTruck() {
        return listBoxesInTruck;
    }

    public int getNumberBox(int numContainer, int numBox) {
        try {
            if (listBoxesInTruck[numContainer][numBox] == 0) {
                return -1;
            }
            return listBoxesInTruck[numContainer][numBox];
        } catch (Exception e) {
            return -1;
        }
    }
}
