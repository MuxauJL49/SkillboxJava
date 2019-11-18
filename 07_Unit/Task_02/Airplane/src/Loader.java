import com.skillbox.airport.*;

import java.time.LocalDate;
import java.util.Date;

public class Loader {
    private static Airport airport;

    public static void main(String[] args) {
        airport = Airport.getInstance();

        long hours = 2;
        long courrentTime = System.currentTimeMillis();
        Date dateNow = new Date(courrentTime);
        //Now + Hour * amount hours
        Date dateAddTwoHours = new Date(courrentTime + (3600*1000) * hours);

        airport.getTerminals().stream()
                .map(Terminal::getFlights)
                .flatMap(f -> f.stream())
                .filter(f -> f.getType() == Flight.Type.DEPARTURE &&
                        f.getDate().compareTo(dateNow) > -1 &&
                        f.getDate().compareTo(dateAddTwoHours) < 1)
                .forEach(System.out::println);
    }
}
