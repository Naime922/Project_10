package ShoppingApp;

public class PremiumBuyer extends Buyer{



    /**This class inherits from Buyer class. It has no additional variables.
     *
     * Create corresponding constructor to super. In the constructor
     *                           set the shippingCost to the value you are getting from calculateShippingCost method
     *
     * Implement checkOut method same as RegularBuyer class
     *
     * Implement calculateShippingCost method. return 0.
     * */

    public PremiumBuyer(String name, String address) {
        super(name, address);
        setShippingCost(calculateShippingCost());
    }

    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        for (Product product : getCart().getCartProduct()) {
            product.getSeller().sellProduct(product);
        }
        if (paymentMethod.equals(PaymentMethod.CREDITCARD)) {
            System.out.println(getCart().getTotal() + calculateShippingCost() + " has been deducted from your card");
        } else if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
            System.out.println("The amount you must pay on delivery is " + (getCart().getTotal() + calculateShippingCost()));
        }

    }

    @Override
    public double calculateShippingCost() {
        return 0.0;
    }
}
