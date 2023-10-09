/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java.poo.example;

/**
 *
 * @author anibal
 */
public class ClientTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // This is a valid client
        try {
            Client client1 = new Client("Anibal", "123456789", "Calle 1", 20);
            System.out.println("Client 1 created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // This is an invalid client (age < 18)
        try {
            Client client2 = new Client("Anibal", "123456789", "Calle 1", 17);
            System.out.println("Client 2 created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // This is an invalid client (address.length() > 15)
        try {
            Client client3 = new Client("Anibal", "123456789", "Central Park, New York, USA", 20);
            System.out.println("Client 3 created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // This is an invalid client (ID.length() != 9)
        try {
            Client client4 = new Client("Anibal", "1234567890", "Calle 1", 20);
            System.out.println("Client 4 created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
