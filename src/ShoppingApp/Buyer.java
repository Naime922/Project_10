package ShoppingApp;

public abstract class Buyer extends User {

    /**
     * This is an abstract class and inherits from User class. It has no additional variables
     * <p>
     * Create corresponding constructor to super.
     * <p>
     * Create abstract void checkOut method with PaymentMethod parameter
     * Create abstract double calculateShippingCost method with PaymentMethod parameter
     */


    public Buyer(String name, String address) {
        super(name, address);
    }

    public abstract void checkOut(PaymentMethod paymentMethod);

    public abstract double calculateShippingCost();

}
