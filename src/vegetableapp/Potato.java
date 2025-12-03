/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class Potato extends VegGuide implements HarvestTime{ //the carrot class takes variables from VegGuide and uses HarvestTime
    private int sunlightCheck; //the unique variable for Potato
    
    public Potato(String colour, String saveName, int time, String size, int rot, int randomDays, int sunlightCheck){
        super(colour, saveName, time, size, rot, randomDays); //vegGuide super class
        this.sunlightCheck = sunlightCheck;
    }

        public int getSunlightCheck() { //the setters and getters
            return sunlightCheck;
        }

        public void setSunlightCheck(int sunlightCheck) {
            this.sunlightCheck = sunlightCheck;
        }
        
    @Override
    public String HarvestTime(){
        return Integer.toString(sunlightCheck); //the toString converts the int sunlightCheck to the String HarvestTime
    }
    
    @Override
    public String printResult(){ //used for the gui
        return super.printResult()+" , "+sunlightCheck;
    }
}


