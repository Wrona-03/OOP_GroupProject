/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgreturn;

import java.io.Serializable;

/**
 *
 * @author Thitsar Thway
 */
public class Receipt implements Serializable{
    private int id;
    private double depositAmount;
    private String storeName;
    private String storeLocation;
//Constructor
    public Receipt() {
        this.id = 0;
        this.depositAmount = 0.0;
        this.storeName = new String();
        this.storeLocation = new String();
    }
    
//Getters and setters
    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
}
