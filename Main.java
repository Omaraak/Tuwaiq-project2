public class Main {
    public static void main(String[] args) {
        Route route1 = new Route("123","000",10);
        Route route2 = new Route("456","999",100);

        Car car1 = new Car("aaa",0,route1);
        Car car2 = new Car("bbb",3,route2);
        Car car3 = new Car("ccc",1,route2);

        Passenger[] passengers = {new SubscribersPassengers("Omar","0001"), new NonSubscribersPassengers("Sam","0002",true), new NonSubscribersPassengers("Ana","0003",false), new NonSubscribersPassengers("Jon","0004",true)};

        passengers[0].reserveCar(car1);

        passengers[0].reserveCar(car2);
        passengers[0].display();

        passengers[1].reserveCar(car2);
        passengers[1].display();

        passengers[2].reserveCar(car3);
        passengers[2].display();

        passengers[3].reserveCar(car3);
        passengers[3].display();
    }
}