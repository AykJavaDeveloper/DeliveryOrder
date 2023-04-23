public class Main {
    public static void main(String[] args) {
        DeliveryOrder deliveryOrderAik = new DeliveryOrder(DeliveryTypeEnum.BIKE, FragileEnum.YES, TypeOfDrinkEnum.COLD);
        System.out.println("Type: " + deliveryOrderAik.getType() + "\n" + "Is fragile: " + deliveryOrderAik.getFragile()
         + "\n" + "Type of drink: " + deliveryOrderAik.getTypeDrink() );
    }
}
