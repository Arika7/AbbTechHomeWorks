package lesson5HW;

public interface Transport {
    void calculateFare(double distance);
    void calculateTime(double distance);
    void calculateFare(double distance, int passengers);

    String getTransportInfo();
}
