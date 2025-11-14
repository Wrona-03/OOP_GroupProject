/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndemo;

/**
 *
 * @author Thitsar Thway
 */
public class Item {
    int itemID;
    String type;
    String size;
    int quantity;
    double depositValue;
    boolean returned;
    
    double calculateItemDeposit(){
        return quantity * depositValue;
    }
    double assignDepositValue(){
        if(size.equalsIgnoreCase("Small")){
            return 0.15;
        }
        else return 0.25;
    }
    boolean markReturned(){
        return returned = true;
    }
}
