package lesson5HW;

import static lesson5HW.TransportManager.getTransport;

public class Lesson5HW {
    public static void main(String[] args) {


        TransportType userChoice = TransportType.TAXI;
        double distance = 10.0;
        int passengers = 2;
        Transport transport = getTransport(userChoice);

        transport.calculateFare(4);
        transport.calculateFare(4,2);
        transport.calculateTime(10);

        System.out.println(transport.getTransportInfo());





    }
}
