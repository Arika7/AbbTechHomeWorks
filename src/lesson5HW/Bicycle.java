package lesson5HW;

public class Bicycle implements Transport{
    TransportType ts = TransportType.BICYCLE;

    private final double ratePerKm =0.20;
    private final double speed= 30;

    @Override
    public void calculateFare(double distance) {
        double fare = distance*ratePerKm;
        System.out.println("Fare for the Bicycle for: "+ ratePerKm+" km is: "+ fare +" AZN");
    }

    @Override
    public void calculateTime(double distance) {
        double time = (distance/speed)*60;
        System.out.println("Time for the Bicycle for: "+ distance+" km is: "+ time +" mins");
    }

    @Override
    public void calculateFare(double distance, int passengers) {
        System.out.println("The fare is same also with passengers");
        }

    @Override
    public String getTransportInfo() {
        return "TransportType: " +ts+"\n"+
                "rate per km is: "+ ratePerKm+" AZN"+"\n"+
                "speed is: " +speed+ " km/h";
    }
}
