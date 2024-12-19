package org.ies.airline.components;

import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class PassengerReader {
    private final Scanner scanner;

    public PassengerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Passenger read(){
        System.out.println("Introduce tu nif");
        String nif = scanner.nextLine();
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String surname = scanner.nextLine();
        System.out.println("Introduce tu asiento");
        Integer seatNumber = scanner.nextInt();
        scanner.nextLine();

        return new Passenger(
                nif,
                name,
                surname,
                seatNumber
        );
    }
}
