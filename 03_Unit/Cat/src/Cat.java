
public class Cat {
    private static int countCats;


    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double massFood;
    private boolean catLive;
    private catColor colorCat;

    public static final int EYES = 2;
    public static final double MIN_WEIGHT = 500d;
    public static final double MAX_WEIGHT = 8000d;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT + 500.0;
        maxWeight = MAX_WEIGHT + 1000.0;

        massFood = 0d;

        catLive = true;
        countCats++;
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
        this.checkLiveCat();
    }

    //clone cat, only for a live cat or new cat
    public static void cloneCat(Cat inCat, Cat outCloneCat) {
        if (outCloneCat.checkLiveCat()) {
            outCloneCat.setWeight(inCat.getWeight());
            outCloneCat.setColorCat(inCat.getColorCat());
            outCloneCat.checkLiveCat();
        }
    }

    //copy cat, can bring the cat back to life
    public void copyCat(Cat inCat){
        this.weight = inCat.getWeight();
        this.originWeight = inCat.originWeight;
        this.colorCat = inCat.colorCat;
        this.massFood = inCat.massFood;
        this.catLive = inCat.catLive;
    }

    public void meow() {
        if (checkLiveCat()) {
            weight = weight - 1;
            System.out.println("Meow");
            checkLiveCat();
        }
    }

    public void feed(Double amount) {
        if (checkLiveCat()) {
            weight = weight + amount;
            massFood += amount;
            checkLiveCat();
        }
    }

    public void drink(Double amount) {
        if (checkLiveCat()) {
            weight = weight + amount;
            checkLiveCat();
        }
    }

    public void goWC() {
        weight = weight - weight / 200d;
        System.out.println("I did it!!1");
    }

    public Double getMassFood() {
        return massFood;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.checkLiveCat();
    }

    public catColor getColorCat() {
        return colorCat;
    }

    public void setColorCat(catColor color) {
        colorCat = color;
    }

    public static int getCountCats() {
        return countCats;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    //This part is checking cat live and enabling to off some methods (deads don't meow)
    public boolean checkLiveCat() {
        if (!catLive) {
            return catLive;
        } else if (getStatus().matches("Dead|Exploded")) {
            catLive = false;
            countCats--;
        }
        return catLive;
    }
}