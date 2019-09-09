import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        for (int i = 0; i < airport.getAllAircrafts().size(); i++) {
            System.out.println((i + 1) + " Aircraft - " + airport.getAllAircrafts().get(i));
        }
    }
}

