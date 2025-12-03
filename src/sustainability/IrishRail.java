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

public class IrishRail implements EmissionCalculator {

    protected ArrayList<String> trainType;
    protected ArrayList<String> trainStation;
    protected double carCarbon;
    protected double trainCarbon;

    public IrishRail() {
        trainType = new ArrayList<>();
        trainType.add(0, "Intercity");
        trainType.add(1, "Commuter");
        trainType.add(2, "DART");
        trainStation = new ArrayList<>();
        trainStation.add(0, "Dublin Heuston");
        trainStation.add(1, "Dublin Connolly");
        trainStation.add(2, "Dublin Pearse");
        carCarbon = 4600;
        trainCarbon = 0.0;
    }

    public ArrayList<String> getTrainType() {
        return trainType;
    }

    public ArrayList<String> getTrainStation() {
        return trainStation;
    }

    @Override
    public void calcCarbonEmis() {
        trainCarbon = carCarbon - 3542;
    }

    public double getTrainCarbon() {
        return trainCarbon;
    }
    
    public double getCarCarbon(){
        return carCarbon;
    }
}
