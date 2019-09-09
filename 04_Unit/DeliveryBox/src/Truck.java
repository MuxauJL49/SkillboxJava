
public class Truck {
    private final int MAX_CONTAINERS;
    private final int MAX_BOXES;

    private int[][] listBoxesInTruck;

    public Truck(){
        MAX_CONTAINERS = 12 - 1;
        MAX_BOXES = 27 - 1;
    }

    public Truck(int container, int boxes){
        MAX_CONTAINERS = container - 1;
        MAX_BOXES = boxes - 1;
    }

    //return number of last box in the truck or -1 if all boxes is loaded and truck isn't filled in.
    public int fillInTruck(int boxes, int numFirstBox){
        listBoxesInTruck = new int[MAX_CONTAINERS][MAX_BOXES];
        for(int cont = 0; cont < MAX_CONTAINERS; cont++){
            for(int box = 0; box < MAX_BOXES; box++){
                if(boxes == 0){
                    return -1;
                }
                listBoxesInTruck[cont][box] = numFirstBox++;
                boxes--;
            }
        }
        return numFirstBox;
    }


    public int getMAX_CONTAINERS(){
        return MAX_CONTAINERS;
    }

    public int getMAX_BOXES(){
        return MAX_BOXES;
    }

    public int[][] getListBoxesInTruck() {
        return listBoxesInTruck;
    }

    public int getNumberBox(int numContainer, int numBox){
        try{
            if(listBoxesInTruck[numContainer][numBox] == 0){
                return -1;
            }
            return listBoxesInTruck[numContainer][numBox];
        }catch(Exception e){
            return -1;
        }
    }
}
