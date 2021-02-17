public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        System.out.println("Factory method returning a truck");
        return new Truck();
    }
}
