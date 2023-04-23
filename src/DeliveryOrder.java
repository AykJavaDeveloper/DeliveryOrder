public class DeliveryOrder {
    private DeliveryTypeEnum type;
    private FragileEnum fragile;

    private TypeOfDrinkEnum typeDrink;

    public DeliveryOrder(DeliveryTypeEnum deliveryType, FragileEnum fragileConstructor, TypeOfDrinkEnum typeOfDrink) {
        type = deliveryType;
        fragile = fragileConstructor;
        typeDrink = typeOfDrink;
    }

    public DeliveryTypeEnum getType() {
        return type;
    }

    public FragileEnum getFragile() {
        return fragile;
    }


    public TypeOfDrinkEnum getTypeDrink() {
        return typeDrink;
    }
}
