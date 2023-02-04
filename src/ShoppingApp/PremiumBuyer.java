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

//    public PremiumBuyer(String name, String address, Cart cart) {
//        super(name, address, cart);
//        this.getShippingCost() = calculateShippingCost();
//        this.getUserType()=UserType.PREMIUM;
//    }
//
//    @Override
//    public void checkOut() {
//        // Code copied from RegularBuyer class
//        double totalCost = getCart().getTotal() + getShippingCost();
//        System.out.println("Total cost for " + getName() + ": $" + totalCost);
//    }
//
//    @Override
//    public double calculateShippingCost() {
//        return 0.0;
//    }
}
