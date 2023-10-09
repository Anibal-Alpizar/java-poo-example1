/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.poo.example;

/**
 *
 * @author anibal
 */
public class Client {

    private String name;
    private String ID;
    private String address; 
    private int age;
    private boolean isAdult;

    public Client(String name, String ID, String address, int age) {
        verifyID(ID);
        verifyAddress(address);
        verifyAge(age);
        this.name = name;
    }

    private void verifyID(String ID) {
        if (ID.length() == 9) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("The ID must have 9 characters");
        }
    }
    private void verifyAddress(String address) {
        if (address.length() <= 15) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("The address must have 15 characters");
        }
    }

    private void verifyAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("The age must be greater than or equal to 18");
        }
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    
    
    
}
