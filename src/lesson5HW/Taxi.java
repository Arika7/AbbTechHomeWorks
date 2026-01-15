package lesson5HW;

public class Taxi implements Transport{
    TransportType ts = TransportType.TAXI;
    private final double ratePerKm =1;
    private final double speed= 60;

    @Override
    public void calculateFare(double distance) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the Taxi for: "+ ratePerKm+" km is: "+ fare + " AZN" );
    }

    @Override
    public void calculateTime(double distance) {
        double time = (distance/speed)*60;
        System.out.println("Time for the Taxi for: "+ distance+" km is: "+ time +"mins" );
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the Taxi for: "+passengers+" passengers "+ distance+" km is: "+ fare+" AZN" );
    }

    @Override
    public String getTransportInfo() {
        return "TransportType: " +ts+"\n"+
                "rate per km is: "+ ratePerKm+" AZN"+ "\n"+
                "speed is: " +speed+ " km/h";
    }
}
