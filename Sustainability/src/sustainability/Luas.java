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

public class Luas {

    protected String luasLine;
    protected ArrayList<String> firstStopRed;
    protected ArrayList<String> lastStopRed;
    protected ArrayList<String> firstStopGreen;
    protected ArrayList<String> lastStopGreen;

    public Luas() {
        luasLine = new String();
        firstStopRed = new ArrayList<>();
        firstStopRed.add("Tallaght");
        firstStopRed.add("Hospital");
        firstStopRed.add("Cookstown");
        firstStopRed.add("Saggart");
        firstStopRed.add("Fortunestown");
        firstStopRed.add("Citywest Campus");
        firstStopRed.add("Cheeverstown");
        firstStopRed.add("Fettercairn");
        firstStopRed.add("Belgard");
        firstStopRed.add("Kingswood");
        firstStopRed.add("Red Cow");
        firstStopRed.add("Kylemore");
        firstStopRed.add("Bluebell");
        firstStopRed.add("Blackhorse");
        firstStopRed.add("Drimnagh");
        firstStopRed.add("Goldenbridge");
        firstStopRed.add("Suir Road");
        firstStopRed.add("Rialto");
        firstStopRed.add("Fatima");
        firstStopRed.add("James's");
        firstStopRed.add("Heuston");
        firstStopRed.add("Museum");
        firstStopRed.add("Smithfield");
        firstStopRed.add("Four Courts");
        firstStopRed.add("Jervis");
        firstStopRed.add("Abbey Street");
        firstStopRed.add("Busaras");
        firstStopRed.add("Connolly");
        firstStopRed.add("George's Dock");
        firstStopRed.add("Mayor Square - NCI");
        firstStopRed.add("Spencer Dock");
        firstStopRed.add("The Point");

        lastStopRed = new ArrayList<>();
        lastStopRed.add("Tallaght");
        lastStopRed.add("Hospital");
        lastStopRed.add("Cookstown");
        lastStopRed.add("Saggart");
        lastStopRed.add("Fortunestown");
        lastStopRed.add("Citywest Campus");
        lastStopRed.add("Cheeverstown");
        lastStopRed.add("Fettercairn");
        lastStopRed.add("Belgard");
        lastStopRed.add("Kingswood");
        lastStopRed.add("Red Cow");
        lastStopRed.add("Kylemore");
        lastStopRed.add("Bluebell");
        lastStopRed.add("Blackhorse");
        lastStopRed.add("Drimnagh");
        lastStopRed.add("Goldenbridge");
        lastStopRed.add("Suir Road");
        lastStopRed.add("Rialto");
        lastStopRed.add("Fatima");
        lastStopRed.add("James's");
        lastStopRed.add("Heuston");
        lastStopRed.add("Museum");
        lastStopRed.add("Smithfield");
        lastStopRed.add("Four Courts");
        lastStopRed.add("Jervis");
        lastStopRed.add("Abbey Street");
        lastStopRed.add("Busaras");
        lastStopRed.add("Connolly");
        lastStopRed.add("George's Dock");
        lastStopRed.add("Mayor Square - NCI");
        lastStopRed.add("Spencer Dock");
        lastStopRed.add("The Point");

        firstStopGreen = new ArrayList<>();
        firstStopGreen.add("Bride's Glen");
        firstStopGreen.add("Cherrywood");
        firstStopGreen.add("Laughanstown");
        firstStopGreen.add("Carrickmines");
        firstStopGreen.add("Ballyogan Wood");
        firstStopGreen.add("Leopardstown Valley");
        firstStopGreen.add("The Gallops");
        firstStopGreen.add("Glencairn");
        firstStopGreen.add("Central Park");
        firstStopGreen.add("Sandyford");
        firstStopGreen.add("Stillorgan");
        firstStopGreen.add("Kilmacud");
        firstStopGreen.add("Balally");
        firstStopGreen.add("Dundrum");
        firstStopGreen.add("Windy Arbour");
        firstStopGreen.add("Milltown");
        firstStopGreen.add("Cowper");
        firstStopGreen.add("Beechwood");
        firstStopGreen.add("Ranelagh");
        firstStopGreen.add("Charlemont");
        firstStopGreen.add("Harcourt");
        firstStopGreen.add("St Stephen's Green");
        firstStopGreen.add("Dawson");
        firstStopGreen.add("Westmoreland");
        firstStopGreen.add("O'Connell - GPO");
        firstStopGreen.add("O'Connell Upper");
        firstStopGreen.add("Trinity");
        firstStopGreen.add("Marlborough");
        firstStopGreen.add("Parnell");
        firstStopGreen.add("Dominick");
        firstStopGreen.add("Broadstone - University");
        firstStopGreen.add("Grangegorman");
        firstStopGreen.add("Phibsborough");
        firstStopGreen.add("Cabra");
        firstStopGreen.add("Broombridge");

        lastStopGreen = new ArrayList<>();
        lastStopGreen.add("Bride's Glen");
        lastStopGreen.add("Cherrywood");
        lastStopGreen.add("Laughanstown");
        lastStopGreen.add("Carrickmines");
        lastStopGreen.add("Ballyogan Wood");
        lastStopGreen.add("Leopardstown Valley");
        lastStopGreen.add("The Gallops");
        lastStopGreen.add("Glencairn");
        lastStopGreen.add("Central Park");
        lastStopGreen.add("Sandyford");
        lastStopGreen.add("Stillorgan");
        lastStopGreen.add("Kilmacud");
        lastStopGreen.add("Balally");
        lastStopGreen.add("Dundrum");
        lastStopGreen.add("Windy Arbour");
        lastStopGreen.add("Milltown");
        lastStopGreen.add("Cowper");
        lastStopGreen.add("Beechwood");
        lastStopGreen.add("Ranelagh");
        lastStopGreen.add("Charlemont");
        lastStopGreen.add("Harcourt");
        lastStopGreen.add("St Stephen's Green");
        lastStopGreen.add("Dawson");
        lastStopGreen.add("Westmoreland");
        lastStopGreen.add("O'Connell - GPO");
        lastStopGreen.add("O'Connell Upper");
        lastStopGreen.add("Trinity");
        lastStopGreen.add("Marlborough");
        lastStopGreen.add("Parnell");
        lastStopGreen.add("Dominick");
        lastStopGreen.add("Broadstone - University");
        lastStopGreen.add("Grangegorman");
        lastStopGreen.add("Phibsborough");
        lastStopGreen.add("Cabra");
        lastStopGreen.add("Broombridge");
    }

    public String getLuasLine() {
        return luasLine;
    }

    public void setLuasLine(String luasLine) {
        this.luasLine = luasLine;

    }

    public ArrayList<String> getFirstStopRed() {
        return firstStopRed;
    }

    public ArrayList<String> getLastStopRed() {
        return lastStopRed;
    }

    public ArrayList<String> getFirstStopGreen() {
        return firstStopGreen;
    }

    public ArrayList<String> getLastStopGreen() {
        return lastStopGreen;
    }

}
