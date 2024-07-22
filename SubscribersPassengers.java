public class SubscribersPassengers extends Passenger{
    private double originalPrice;
    private double discount=0.50;
    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getMaxCapacity() <= 0)
                throw new RuntimeException();
            if (car.getNumPassengers() < car.getMaxCapacity()) {
                originalPrice = car.getRoutePrice();
                super.setTripCost(originalPrice - (originalPrice * discount));
                super.setReservedCar(car);
                car.setNumPassengers(car.getNumPassengers()+1);
            }else
                System.out.println("Can't do it the car at full capacity\n");
        }catch (RuntimeException e){
            System.out.println("maximum capacity can't be equal or lower then zero\n");
        }
    }

    public void display(){
        System.out.println("User info\nSubscription stat: Subscribed"+"\nname: "+super.getName()+" id: "+super.getId()+"\nCar info\n"+super.getReservedCar()+" Original trip cost: "+originalPrice+"\nTrip cost after 50% discount: "+super.getTripCost()+"\n");
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
