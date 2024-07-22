public class NonSubscribersPassengers extends Passenger{
    private boolean hasDiscountCoupon;
    private double originalPrice;
    private double discount=0.10;

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isHasDiscountCoupon() {
        return hasDiscountCoupon;
    }

    public void setHasDiscountCoupon(boolean hasDiscountCoupon) {
        this.hasDiscountCoupon = hasDiscountCoupon;
    }
    public NonSubscribersPassengers(String name, String id, boolean hasDiscountCoupon) {
        super(name, id);
        this.hasDiscountCoupon = hasDiscountCoupon;
    }
    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getMaxCapacity() <= 0)
                throw new RuntimeException();
            if(car.getNumPassengers() < car.getMaxCapacity()) {
                originalPrice = car.getRoutePrice();
                if (hasDiscountCoupon)
                    super.setTripCost(originalPrice - (originalPrice * discount));
                else
                    super.setTripCost(originalPrice);
                super.setReservedCar(car);
                car.setNumPassengers(car.getNumPassengers()+1);
            }else
                System.out.println("Can't do it the car at full capacity\n");
        }catch (RuntimeException e) {
            System.out.println("maximum capacity can't be equal or lower then zero");
        }
    }
    public void display(){
        System.out.println("User info\nSubscription stat: Not subscribed"+"\nname: "+super.getName()+" id: "+super.getId()+"\nCar information\n"+getReservedCar()+((hasDiscountCoupon)?" has discount: Yes"+"\nOriginal trip cost: "+originalPrice+"\nTrip cost after 10% discount: "+super.getTripCost()+"\n"  :  " has discount: No"+"\nTrip cost : "+super.getTripCost()+"\n"));
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
