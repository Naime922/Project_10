package ShoppingApp;

public class PremiumSeller extends Seller{




    /** This class inherits from Seller class. It has no additional variables.
     *
     * Create a corresponding constructor. In the constructor
     *                      set feeFromPerSale to 0.5
     *                      set userType as PREMIUM
     *
     * Implement sellProduct method the same way from RegularSeller class
     * */
    public PremiumSeller(String name, String address) {
        super(name, address);
        setFeeFromPerSale(0.5);
        setUserType(UserType.PREMIUM);
    }

    @Override
    public void sellProduct(Product product){

        setBalance(product.getPrice()- product.getPrice()*getFeeFromPerSale());
        product.setStock(product.getStock()-1);
    }

    /*     * Implement sellProduct method and in the method
     *                  set balance to productPrice-productPrice*feeFromPerSale
     *                  and reduce product stock by 1
            * */
}


