/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgreturn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Thitsar Thway
 */
public class ItemLog implements Serializable {

    private int smallCount;
    private int largeCount;
    private int pendingCount;
    private double pendingDeposit;
    private int lifetimeCount;
    private double lifetimeDeposit;
    private Reminder reminder;

//Constructor

    public ItemLog() {
        this.smallCount = 0;
        this.largeCount = 0;
        this.pendingCount = 0;
        this.pendingDeposit = 0.0;
        this.lifetimeCount = 0;
        this.lifetimeDeposit = 0.0;
        this.reminder = new Reminder(); //initialize reminder
    }
//Getters and Setters

    public int getSmallCount() {
        return smallCount;
    }

    public void setSmallCount(int smallCount) {
        this.smallCount = smallCount;
    }

    public int getLargeCount() {
        return largeCount;
    }

    public void setLargeCount(int largeCount) {
        this.largeCount = largeCount;
    }

    public int getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(int pendingCount) {
        this.pendingCount = pendingCount;
    }

    public double getPendingDeposit() {
        return pendingDeposit;
    }

    public void setPendingDeposit(double pendingDeposit) {
        this.pendingDeposit = pendingDeposit;
    }

    public int getLifetimeCount() {
        return lifetimeCount;
    }

    public void setLifetimeCount(int lifetimeCount) {
        this.lifetimeCount = lifetimeCount;
    }

    public double getLifetimeDeposit() {
        return lifetimeDeposit;
    }

    public void setLifetimeDeposit(double lifetimeDeposit) {
        this.lifetimeDeposit = lifetimeDeposit;
    }

    public Reminder getReminder() {
        return reminder;
    }

//Methods
    public double addToPending(int quantity, double depositPerItem, boolean small) {
        //tally size-based counts to display in return items screen
        if (small) {
            this.smallCount += quantity;
        } else {
            this.largeCount += quantity;
        }
        //calculate deposit from parameters
        double calculatedDeposit = quantity * depositPerItem;
        //update totals
        this.pendingCount += quantity;
        this.pendingDeposit += calculatedDeposit;
        this.lifetimeCount += quantity;
        this.lifetimeDeposit += calculatedDeposit;
        return calculatedDeposit;
    }

    public void save() {
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        try {

            outFile = new File("logFile.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(this); //write to instance of this object
            oStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void load() {
        File inFile = new File("logFile.data");
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {

            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            //load saved object from file
            ItemLog loaded;
            loaded = (ItemLog) oStream.readObject();
            //copy loaded values into current object
            this.smallCount = loaded.smallCount;
            this.largeCount = loaded.largeCount;
            this.pendingCount = loaded.pendingCount;
            this.pendingDeposit = loaded.pendingDeposit;
            this.lifetimeCount = loaded.lifetimeCount;
            this.lifetimeDeposit = loaded.lifetimeDeposit;
            this.reminder = loaded.reminder;
            oStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file found. Enter data to create file.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error loading file:" + ex);
        }
    }
}
