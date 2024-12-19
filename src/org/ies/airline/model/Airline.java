package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String name;
    private Flight[] flights;

    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public void showFlight(){
        for(var flight : flights){
            flight.showInfo();
        }
    }

    public void showFlightFromOrigin(String origin){
        for(var flight : flights){
            if(flight.getOrigin().equals(origin)){
                System.out.println(flight.getOrigin());
            }
        }
    }

    public void showPassengerFlights(String nif, int flightNumber){
        var findFlight = findFlight(flightNumber);
        if(findFlight != null){
            for(var passenger: flights){
                if(passenger.findPassenger(nif) != null){
                    passenger.showInfo();
                }
            }
        }
    }

    public Flight findFlight (int numberFlight){
        for (var flight: flights){
            if(flight.getFlightNumber() == numberFlight){
                return flight;
            }
        }
        return null;
    }

    public Passenger getPassengerSeat(int flightNumber, String nif){
        var findFlight = findFlight(flightNumber);
        for(var flight : flights){
            if(findFlight != null){
                for(var passenger: flights){
                    if(flight.findPassenger(nif) != null){

                    }
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
