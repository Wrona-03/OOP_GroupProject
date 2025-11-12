/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author wikto
 */
public class IrishRail {

    protected String trainType;
    protected String trainStation;
    protected String lastStation;
    protected double carbonEmis;

    public IrishRail() {
        trainType = new String();
        trainStation = new String();
        lastStation = new String();
        carbonEmis = 0.0;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation;
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = lastStation;
    }

    public double getCarbonEmis() {
        return carbonEmis;
    }

    public void setCarbonEmis(double carbonEmis) {
        this.carbonEmis = carbonEmis;
    }

}
