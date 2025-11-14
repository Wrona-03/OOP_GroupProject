/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author wikto
 */
public class BusService {

    protected String busType;
    protected double carbonEmis;

    public BusService() {
        busType = new String();
        carbonEmis = 0.0;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public double getCarbonEmis() {
        return carbonEmis;
    }

    public void setCarbonEmis(double carbonEmis) {
        this.carbonEmis = carbonEmis;
    }

}
