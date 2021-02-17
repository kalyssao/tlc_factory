public class SeaLogistics extends Logistics{

    @Override
    Transport createTransport() {
        System.out.println("Factory Method returning ship product");
        return new Ship();
    }
}
