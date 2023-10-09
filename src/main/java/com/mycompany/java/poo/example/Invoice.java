/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.poo.example;

/**
 *
 * @author anibal
 */
public class Invoice {

    private String IDInvoice;
    private Client client; // Usamos un objeto Client en lugar de solo el IDClient
    private String nameClient;
    private String bikeCode;
    private int distance;
    private double amount;

    public Invoice(String IDInvoice, Client client, String nameClient, String bikeCode, String distance) {
        this.IDInvoice = IDInvoice;
        this.client = client; // Almacenamos el objeto Client
        this.nameClient = nameClient;
        this.bikeCode = bikeCode;
        this.distance = Integer.parseInt(distance);
        this.amount = calculateAmount();
        
        // Verificar si el IDClient coincide con el ID del cliente asociado
        if (!this.client.getID().equals(client.getID())) {
            throw new IllegalArgumentException("El IDClient no coincide con el ID del cliente proporcionado.");
        }
    }

    private double calculateAmount() {
        final double tarifaBase = 3000;
        double porcentaje = 0.0;

        if (distance <= 1000) {
            porcentaje = 0.5; // 50%
        } else if (distance <= 2000) {
            porcentaje = 0.3; // 30%
        } else if (distance <= 3000) {
            porcentaje = 0.2; // 20%
        } else {
            porcentaje = 0.1; // 10%
        }

        return tarifaBase + (tarifaBase * porcentaje);
    }

    public String getIDInvoice() {
        return IDInvoice;
    }

    public void setIDInvoice(String IDInvoice) {
        this.IDInvoice = IDInvoice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getBikeCode() {
        return bikeCode;
    }

    public void setBikeCode(String bikeCode) {
        this.bikeCode = bikeCode;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
 public String getIDClient() {
        return client.getID(); // Retorna el IDClient del cliente asociado
    }
}
