/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

import java.util.ArrayList;

/**
 *
 * @author wikto
 */
public class BusService implements EmissionCalculator {

    protected ArrayList<String> busType;
    protected String userSelectBus;
    protected double carCarbon;
    protected double busDCarbon;
    protected double busHCarbon;

    public BusService() {
        busType = new ArrayList<>();
        busType.add(0, "Electric");
        busType.add(1, "Hybrid");
        busType.add(2, "Diesal");
        userSelectBus = " ";
        carCarbon = 4600;
        busDCarbon = 0.0;
        busHCarbon = 0.0;
    }

    public void setUserSelectBus(String userSelectBus) {
        this.userSelectBus = userSelectBus;
    }


    @Override
    public void calcCarbonEmis() {
        busDCarbon = 3200;
        busHCarbon = 3200 / 2;
    }
    
    public double getBusDCarbon(){
        return busDCarbon;
    }
    
    public double getBusHCarbon(){
        return busHCarbon;
    }

    public double getCarCarbon() {
        return carCarbon;
    }

}
