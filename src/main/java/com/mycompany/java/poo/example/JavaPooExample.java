/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java.poo.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class JavaPooExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Client> clients = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        while (true) {
            try {
                System.out.print("Ingrese el ID del cliente (deben ser 9 caracteres): ");
                String ID = scanner.nextLine();

                Client client = null;

                // Buscar el cliente por su ID en la lista de clientes
                for (Client c : clients) {
                    if (c.getID().equals(ID)) {
                        client = c;
                        break;
                    }
                }

                if (client == null) {
                    System.out.print("Ingrese el nombre del cliente: ");
                    String name = scanner.nextLine();

                    System.out.print("Ingrese la dirección del cliente (máximo 15 caracteres): ");
                    String address = scanner.nextLine();

                    System.out.print("Ingrese la edad del cliente (debe ser mayor o igual a 18): ");
                    int age = Integer.parseInt(scanner.nextLine());

                    client = new Client(name, ID, address, age);
                    clients.add(client);
                }

                System.out.print("Ingrese el ID de la factura: ");
                String IDInvoice = scanner.nextLine();
                String nameClient = client.getName();

                System.out.print("Ingrese el código de la bicicleta: ");
                String bikeCode = scanner.nextLine();

                System.out.print("Ingrese la distancia recorrida en kilómetros: ");
                String distanceStr = scanner.nextLine();

                Invoice invoice = new Invoice(IDInvoice, client, nameClient, bikeCode, distanceStr);
                invoices.add(invoice);

                System.out.print("¿Desea ingresar otra factura? (S/N): ");
                String continueOption = scanner.nextLine().trim().toLowerCase();
                if (!continueOption.equals("s")) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Información de las facturas ingresadas:");
        for (Invoice invoice : invoices) {
            System.out.println("Nombre del cliente: " + invoice.getNameClient());
            System.out.println("ID del cliente: " + invoice.getIDClient());
            System.out.println("Código de la bicicleta: " + invoice.getBikeCode());
            System.out.println("Distancia recorrida (km): " + invoice.getDistance());
            System.out.println("Monto a pagar: $" + invoice.getAmount());
            System.out.println();
        }
    }
}
