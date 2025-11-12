/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author wikto
 */
public class Luas {

    protected String luasLine;
    protected String firstStop;
    protected String lastStop;

    public Luas() {
        luasLine = new String();
        firstStop = new String();
        lastStop = new String();
    }

    public String getLuasLine() {
        return luasLine;
    }

    public void setLuasLine(String luasLine) {
        this.luasLine = luasLine;
    }

    public String getFirstStop() {
        return firstStop;
    }

    public void setFirstStop(String firstStop) {
        this.firstStop = firstStop;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }

}
