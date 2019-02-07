import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FlightDuration extends AirplaneFlight {
    //FIelds
    private long hours;
    private long minutes;

    // Constructors

    public FlightDuration(int flightNumber, Airports departureAirport, Airports arrivalAirport) {
        super(flightNumber, departureAirport, arrivalAirport);
    }

    public FlightDuration(int flightNumber, Airports departureAirport, Airports arrivalAirport, LocalTime timeOfDeparture, LocalTime timeOfArrival) {
        super(flightNumber, departureAirport, arrivalAirport, timeOfDeparture, timeOfArrival);
    }

    // methods
    public long getDuration() {
        if (getTimeOfDeparture() != null && getTimeOfArrival() != null) {
            return ChronoUnit.MINUTES.between(getTimeOfDeparture(), getTimeOfArrival());
        } else {
            return 0L;
        }
    }

}

