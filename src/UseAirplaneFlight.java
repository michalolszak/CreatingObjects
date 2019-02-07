
import  java.time.Duration;
import java.time.LocalTime;

import static java.lang.System.out;

public class UseAirplaneFlight {
    public static void main(String args[]) {
        LocalTime pcCurrentTime = LocalTime.now();

        final String format = "Flight number %d from %s to %s \nTime of departure: %tR \nTime of arrival: %tR\n";

        AirplaneFlight flight = new AirplaneFlight(256, Airports.KRK, Airports.BER);
        flight.setTimeOfDeparture(pcCurrentTime);
        flight.setTimeOfArrival(pcCurrentTime.plusHours(2).plusMinutes(15));
        out.printf(format, flight.getFlightNumber(), flight.getDepartureAirport(), flight.getArrivalAirport(), flight.getTimeOfDeparture(), flight.getTimeOfArrival());

        FlightDuration duration = new FlightDuration(flight.getFlightNumber(),flight.getArrivalAirport(),flight.getDepartureAirport(), flight.getTimeOfDeparture(),flight.getTimeOfArrival());
        if (duration.getDuration()!= 0L) {
            out.printf("The flight duration: %d", duration.getDuration());
        }

    }
}
