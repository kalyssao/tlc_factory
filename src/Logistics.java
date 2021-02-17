public abstract class Logistics {
    public Transport planDelivery (){
        Transport transport;
        System.out.println("Planning delivery....");

        transport = createTransport();

        return transport;
    }

    abstract Transport createTransport();

}
