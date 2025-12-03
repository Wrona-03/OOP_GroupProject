/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class Onion extends VegGuide implements HarvestTime{ //the carrot class takes variables from VegGuide and uses HarvestTime
    private String dirtCoverage; //the unique variable for Onion
    
        public Onion(String colour, String saveName, int time, String size, int rot, int randomDays, String dirtCoverage){
        super(colour, saveName, time, size, rot, randomDays); //vegGuide super class
        this.dirtCoverage = dirtCoverage;
    }

        public String getDirtCoverage() { //the setters and getters
            return dirtCoverage;
        }

        public void setDirtCoverage(String dirtCoverage) {
            this.dirtCoverage = dirtCoverage;
        }
        
    @Override
    public String HarvestTime(){
        return dirtCoverage;
    }
    
    @Override
    public String printResult(){ //used for the gui
        return super.printResult()+" , "+dirtCoverage;
    }
}
