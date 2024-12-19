package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineReader {
    private final Scanner scanner;
    private final FlightReader flightReader;

    public AirlineReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }

    public Airline read(){
        System.out.println("Introduce el nombre de la aerolínea");
        String name = scanner.nextLine();
        System.out.println("Introduce el número de vuelos que hay");
        int n = scanner.nextInt();
        scanner.nextLine();

        Flight[] flights = new Flight[n];
        for (int i = 0; i < flights.length; i++) {
            System.out.println("Introduce la información del vuelo");
            flights[i] = flightReader.read();
        }
        return new Airline(
                name,
                flights
        );
    }
}
