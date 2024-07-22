public class Car {
    private String code;
    private int maxCapacity,numPassengers;

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public Route getRoute() {
        return route;
    }

    private Route route;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getRoutePrice() {
        return route.getPrice();
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Car(String code, int maxCapacity, Route route) {
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.route = route;
    }
    public String toString(){
        return "Car code: "+code+" Max Capacity: "+maxCapacity+"\n";
    }
}
