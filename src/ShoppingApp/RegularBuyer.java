package ShoppingApp;


import static ShoppingApp.PaymentMethod.CASHonDELIVERY;
import static ShoppingApp.PaymentMethod.CREDITCARD;

 public class RegularBuyer extends Buyer {
    // This class inherits from Buyer class. It has no additional variables
    //  Create a corresponding constructor to super
    public RegularBuyer(String name, String address) {
        super(name, address);
    }

    /* Implement checkOut method. In the method
     *      call sellProduct method for each product and
     *      if payment method is CREDITCARD print "$cardTotal+shipping has been deducted from your card"
     *      if payment method is CASHonDELIVERY print "The amount you must pay on delivery is $cardTotal+shipping"
     */

    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        //sellProduct() method will be added for ach product
        for (Product product: getCart().getCartProduct()) {
            product.getSeller().sellProduct(product);

            if(paymentMethod.equals(PaymentMethod.CREDITCARD)){
                System.out.println(getCart().getTotal()+calculateShippingCost() + " has been deducted from your card");
            } else if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
                System.out.println("The amount you must pay on delivery is " + (getCart().getTotal()+calculateShippingCost()));
            }


     // implement calculateShipping method. In the method
    //          if cart total is less than $50 return cartTotal*0.10
    @Override
    public double calculateShippingCost() {
        if (getCart().getTotal() < 50) {
            return getCart().getTotal() * 0.10;
        }
        return 0;
    }

   }


