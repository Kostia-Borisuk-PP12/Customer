package app1;

public class CalcCostDelivery extends CalcCostBase {

    private final static double deliveryPrice = 7.0;

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}


