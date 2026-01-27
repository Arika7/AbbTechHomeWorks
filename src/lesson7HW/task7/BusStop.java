package lesson7HW.task7;

import java.util.*;

public class BusStop {
    String busStopName;
    List<Passenger> passengerlist = new LinkedList<>();


    public BusStop(String busStopName, List<Passenger> passengerlist) {
        this.busStopName = busStopName;
        this.passengerlist = passengerlist;
    }

    @Override
    public String toString() {
        return busStopName;
    }
}
