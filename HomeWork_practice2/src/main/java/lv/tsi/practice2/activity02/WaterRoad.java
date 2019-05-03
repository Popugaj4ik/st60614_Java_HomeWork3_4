package lv.tsi.practice2.activity02;

import lv.tsi.practice2.activity01.Road;

public class WaterRoad extends Road {
    public WaterRoad(String from, String to, int distance) {
        super(from, to, distance);
    }

    public WaterRoad() {
    }

    public String toString() {
        return "WaterRoad " + super.getFrom() + " — " + getTo() + ", " + super.getDistance() + "km";
    }


}
