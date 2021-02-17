public class LogisticsApp {
    public static void main(String[] args) {
//        Logistics seaLog = new SeaLogistics();
//
//        Transport ship = seaLog.planDelivery();
//
//        ship.deliver();

        Logistics roadLog = new RoadLogistics();
        Transport truck = roadLog.planDelivery();

        truck.deliver();
    }
}
