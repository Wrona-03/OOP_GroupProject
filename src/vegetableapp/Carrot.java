/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class Carrot extends VegGuide implements HarvestTime{ //the carrot class takes variables from VegGuide and uses HarvestTime
    private String seasonCheck; //the unique variable for Carrot
    
        public Carrot(String colour, String saveName, int time, String size, int rot, int randomDays, String seasonCheck){
        super(colour, saveName, time, size, rot, randomDays); //vegGuide super class
        this.seasonCheck = seasonCheck;
    }

        public String getSeasonCheck() { //the setters and getters
            return seasonCheck;
        }

        public void setSeasonCheck(String seasonCheck) {
            this.seasonCheck = seasonCheck;
        }
        
    @Override
    public String HarvestTime(){
        return seasonCheck;
    }
    
    @Override
    public String printResult(){ //used for the gui
    return super.printResult()+" , "+seasonCheck;
    }
}
