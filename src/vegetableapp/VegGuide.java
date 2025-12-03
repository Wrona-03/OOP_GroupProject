/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class VegGuide {
    private String colour; //variable for the question about vegetable colour
    private String saveName; //variable for the saved name users create
    private String size; //variable for the question about vegetable size
    private int time; //variable for the question about the amount of days
    private int rot; //variable for the rot counter determining if the vegetable is rotten
    private int randomDays; //variable for the day randomizer that decides how long until harvest
    
    public VegGuide(String colour, String saveName, int time, String size, int rot, int randomDays){ //declares each variable
        this.colour = colour;
        this.saveName = saveName;
        this.time = time;
        this.size = size;
        this.rot = rot;
        this.randomDays = randomDays;
    }
    
    public VegGuide(){ //declares what each variable starts as
        colour = "no input"; //if no input is typed by the user, this will appear
        size = "no input"; //if no input is typed by the user, this will appear
        saveName = "no input"; //if no input is typed by the user, this will appear
        time = 0; //default parameter 
        rot = 0; //default parameter 
        randomDays = 0; //default parameter 
    }
        //setters and getters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRot() {
        return rot;
    }

    public void setRot(int rot) {
        this.rot = rot;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public int getRandomDays() {
        return randomDays;
    }

    public void setRandomDays(int randomDays) {
        this.randomDays = randomDays;
    }
    
    public String printResult(){ //saves the results from the form
        return colour+" , "+time+" , "+size+" , "+saveName+" , "+rot+" , "+randomDays;
    }
}

