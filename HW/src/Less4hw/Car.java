package Less4hw;

public class Car {

    private String name;
    private String model;
    private double latitude;
    private double longitude;
    private int distance;
    private int number;

    public Car(String name, String model, double latitude, double longitude, int distance, int number) {
        this.name = name;
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", distance=" + distance +
                ", number='" + number + '\'' +
                "";
    }
}
