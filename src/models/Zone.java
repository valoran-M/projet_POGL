package models;

import java.awt.Point;

/**
 * Zone
 */
public class Zone {

    private Point c;
    private int waterLvl;
    private final int maxWaterLvl;

    public Zone(int x, int y){
        this.c = new Point(x, y);
        this.waterLvl = 0;
        this.maxWaterLvl = 3;
    }

    public void modifie(int x, int y){
        this.c.move((int) this.c.getX() + x,(int) this.c.getY() + y);
    }

    public Point getCoord(){
        return this.c;
    }

    public void dry() throws Exception {
        if(waterLvl > 0){
            this.waterLvl -= 1;
        } else {
            throw new Exception("it's already dry !");
        }
    }

    public void drown(){
        if(waterLvl < maxWaterLvl){
            this.waterLvl += 1;
        }
    }
}