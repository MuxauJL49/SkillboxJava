
public class Truck {
    private final int maxContainers;
    private final int maxBoxses;

    private int[][] listBoxesInTruck;

    public Truck() {
        maxContainers = 12;
        maxBoxses = 28;
    }

    public Truck(int container, int boxes) {
        maxContainers = container;
        maxBoxses = boxes;
    }

    //return number of last box in the truck or -1 if all boxes is loaded and truck isn't filled in.
    public int fillInTruck(int boxes, int numFirstBox) {
        boxes -= (numFirstBox - 1);
        listBoxesInTruck = new int[maxContainers][maxBoxses];
        for (int cont = 0; cont < maxContainers; cont++) {
            for (int box = 0; box < maxBoxses; box++) {
                if (boxes == 0) {
                    return -1;
                }
                listBoxesInTruck[cont][box] = numFirstBox++;
                boxes--;
            }
        }
        return numFirstBox;
    }


    public int getMaxContainers() {
        return maxContainers;
    }

    public int getMaxBoxses() {
        return maxBoxses;
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
