package lesson5HW;

public class Scooter implements Transport{
    TransportType ts = TransportType.SCOOTER;

    private final double ratePerKm =0.1;
    private final double speed= 25;


    @Override
    public void calculateFare(double distance) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the SCOOTER for: "+ ratePerKm+" km is: "+ fare +" AZN");
    }

    @Override
    public void calculateTime(double distance) {
        double time = (distance/speed)*60;
        System.out.println("Time for the SCOOTER for: "+ distance+" km is: "+ time +" mins" );
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        System.out.println("You can't have passengers on scooter, it is dangerous!");
    }

    @Override
    public String getTransportInfo() {
        return "TransportType: " +ts+"\n"+
                "rate per km is: "+ ratePerKm+" AZN"+"\n"+
                "speed is: " +speed+ " km/h";
    }
}
