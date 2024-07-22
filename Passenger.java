public abstract class Passenger {
    private String name,id;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Passenger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public void display(){
        System.out.println("Passenger\nname: "+name+"id: "+id+"\nCar code: "+reservedCar.getCode()+"Route price: "+reservedCar.getRoutePrice()+"\n");
    }
    public abstract void reserveCar(Car car);
}
