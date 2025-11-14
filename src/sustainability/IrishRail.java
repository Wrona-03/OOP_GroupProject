/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author wikto
 */

import java.util.ArrayList;
public class IrishRail {

    protected ArrayList<String> trainType;
    protected ArrayList<String> trainStation;
    protected String lastStation;
    protected double carbonEmis;

    public IrishRail() {
        trainType = new ArrayList<>();
            trainType.add(0, "Intercity");
            trainType.add(1, "Commuter");
            trainType.add(2, "DART");
        trainStation = new ArrayList<>();
            trainStation.add(0, "Dublin Heuston");
            trainStation.add(1, "Dublin Connolly");
            trainStation.add(2, "Dublin Pearse");
        lastStation = new String();
        carbonEmis = 0.0;
    }
    


    public ArrayList<String> getTrainType() {
        return trainType;
    }

    public ArrayList<String> getTrainStation() {
        return trainStation;
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
}
