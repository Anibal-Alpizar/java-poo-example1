/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java.poo.example;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anibal
 */
public class JavaPooExample {

    public static void main(String[] args) {

       List<Invoice> invoices = new ArrayList<>();
        
        while (true) {
            try {
                // Solicitar datos al usuario utilizando JOptionPane
                String name = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                String ID = JOptionPane.showInputDialog("Ingrese el ID del cliente (deben ser 9 caracteres):");
                String address = JOptionPane.showInputDialog("Ingrese la dirección del cliente (máximo 15 caracteres):");
                String ageStr = JOptionPane.showInputDialog("Ingrese la edad del cliente (debe ser mayor o igual a 18):");
                
                // Crear una instancia de Client y validar los datos
                Client client = new Client(name, ID, address, Integer.parseInt(ageStr));

                String IDInvoice = JOptionPane.showInputDialog("Ingrese el ID de la factura:");
                String nameClient = client.getName();
                String bikeCode = JOptionPane.showInputDialog("Ingrese el código de la bicicleta:");
                String distanceStr = JOptionPane.showInputDialog("Ingrese la distancia recorrida en kilómetros:");

                // Crear una instancia de Invoice y validar los datos
                Invoice invoice = new Invoice(IDInvoice, client, nameClient, bikeCode, distanceStr);
                
                invoices.add(invoice); // Agregar la factura a la lista
                
                int continueOption = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (continueOption == JOptionPane.NO_OPTION) {
                    break; // Salir del bucle si el usuario no desea ingresar más facturas
                }
            } catch (IllegalArgumentException e) {
                // Capturar y mostrar cualquier excepción generada durante la entrada de datos
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Mostrar la información de todas las facturas ingresadas
        StringBuilder invoiceInfo = new StringBuilder("Información de las facturas ingresadas:\n");
        for (Invoice invoice : invoices) {
            invoiceInfo.append("Nombre del cliente: ").append(invoice.getNameClient()).append("\n");
            invoiceInfo.append("ID del cliente: ").append(invoice.getIDClient()).append("\n");
            invoiceInfo.append("Código de la bicicleta: ").append(invoice.getBikeCode()).append("\n");
            invoiceInfo.append("Distancia recorrida (km): ").append(invoice.getDistance()).append("\n");
            invoiceInfo.append("Monto a pagar: $").append(invoice.getAmount()).append("\n");
            invoiceInfo.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, invoiceInfo.toString(), "Información de Facturas", JOptionPane.INFORMATION_MESSAGE);
    
    }

}
