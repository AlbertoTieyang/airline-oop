package org.ies.airline.components;

import org.ies.airline.model.Flight;
import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class FlightReader {
    private final Scanner scanner;
    private final PassengerReader passengerReader;

    public FlightReader(Scanner scanner, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.passengerReader = passengerReader;
    }

    public Flight read(){
        System.out.println("Introduce el número del vuelo");
        int numberFlight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el origen del vuelo");
        String origin = scanner.nextLine();
        System.out.println("Introduzca el destino del vuelo");
        String destin = scanner.nextLine();
        System.out.println("Introduzca el número de puerta");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce los pasajeros");
        int n = scanner.nextInt();
        scanner.nextLine();

        Passenger[] passenger = new Passenger[n];
        for (int i = 0; i < passenger.length; i++) {
            System.out.println("Introduce el pasajero "+i);
            passenger[i] = passengerReader.read();
        }

        return new Flight(
                numberFlight,
                origin,
                destin,
                gateNumber,
                passenger
        );
    }
}
