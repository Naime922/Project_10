package ShoppingApp;

public class RegularSeller extends Seller {
    /** This class inherits from Seller class. It has no additional variables.
     * Create a corresponding constructor with super and in the constructor
     *                  set feeFromPerSale to 0.10,
     *                  set userType as REGULAR
     *
     * Implement sellProduct method and in the method
     *                  set balance to productPrice-productPrice*feeFromPerSale
     *                  and reduce product stock by 1
     * */

    public RegularSeller(String name, String address) {
        super(name, address);
        setFeeFromPerSale(0.10);
        setUserType(UserType.REGULAR);

    }

    @Override
    public void sellProduct(Product product) {
        setBalance(product.getPrice()- product.getPrice()*getFeeFromPerSale());
        product.setStock(product.getStock()-1);
    }



}
