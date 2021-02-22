/* This shows a coupled logistics app example - in the situation where the delivery method is baked in to the truck class, and we would have to
implement a new class for each new type of vehicle, as well as a
delivery method for each vehicle. We would also have to initialise with new()
each time */
public class CoupledLogistics {
    public static class Truck {
        String id;
        String deliveryMethod = "delivered by box in a truck";

        public Truck(String id){
            this.id = id;
            System.out.println("initialised a truck");
        }

        public void deliverGoods(){
            System.out.println(this.deliveryMethod);
        }

    }
    public static void main(String[] args) {
        Truck truck1 = new Truck("001");
        System.out.println("=======");
        truck1.deliverGoods();
    }
}
