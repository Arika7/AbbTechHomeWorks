package lesson5HW;

public class Bus implements Transport{
    TransportType ts = TransportType.BUS;

    private final double ratePerKm =0.3;
    private final double speed= 40;


    @Override
    public void calculateFare(double distance) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the Bus for: "+ ratePerKm+" km is: "+ fare+" AZN" );
    }

    @Override
    public void calculateTime(double distance) {
        double time = (distance/speed)*60;
        System.out.println("Time for the Bus for: "+ ratePerKm+" km is: "+ time +" mins");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the Bus for: "+passengers+" passengers "+ distance+" km is: "+ fare +" AZN");
    }

    @Override
    public String getTransportInfo() {
        return "TransportType: " +ts+"\n"+
                "rate per km is: "+ ratePerKm+" AZN"+"\n"+
                "speed is: " +speed+ " km/h";
    }

}
