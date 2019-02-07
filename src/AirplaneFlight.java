import java.time.LocalTime;

public class AirplaneFlight {
    //    FIelds
    private int flightNumber;
    private Airports departureAirport;
    private Airports arrivalAirport;
    private LocalTime timeOfDeparture;
    private LocalTime timeOfArrival;

    //    Constructors
    public AirplaneFlight(int flightNumber, Airports departureAirport, Airports arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public AirplaneFlight(int flightNumber, Airports departureAirport, Airports arrivalAirport, LocalTime timeOfDeparture, LocalTime timeOfArrival) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    //    Setters and Getters

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airports departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airports arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(LocalTime timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

}
