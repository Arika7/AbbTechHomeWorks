package lesson5HW;

public class TransportManager {


    static Transport getTransport(TransportType transportType){
        switch (transportType){
            case TransportType.SCOOTER -> {return new Scooter();}
            case TransportType.BICYCLE -> {return new Bicycle();}
            case TransportType.BUS -> {return new Bus();}
            default -> {
                return new Taxi();
            }

    }
}}
