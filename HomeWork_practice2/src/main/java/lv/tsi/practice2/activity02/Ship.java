package lv.tsi.practice2.activity02;

import lv.tsi.practice2.activity01.Road;
import lv.tsi.practice2.activity01.Transport;

public class Ship extends Transport {

    protected byte numbers_of_sails;
    private byte sails;

    public Ship(String id, byte sails){
        super(id,0,0);
        this.sails=sails;
    }

    @Override
    public String move(Road Road){
        if(Road instanceof WaterRoad){
            return super.getId() + " Ship is sailing on " + Road.toString() + " with " + numbers_of_sails + " sails";
        }
        else{
            return "Cannot sail on " + Road.toString() + " if it is not WaterRoad";
        }
    }
}
