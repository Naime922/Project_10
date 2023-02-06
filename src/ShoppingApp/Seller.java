package ShoppingApp;


import java.util.ArrayList;
import java.util.List;

public abstract class Seller extends User{

    /** This is an abstract class and it inherits from User class. It has
     *                      private list of Product named products,
     *                      private double balance,
     *                      private double feeFromPerSale variables*/
    private List<Product>products;
    private double balance;
    private double feeFromPerSale;

    /*** Create a corresponding constructor to super. Set balance to 0 and initialize necessary fields.*/
    public Seller(String name, String address) {
        super(name, address);
        this.balance=0;
        products=new ArrayList<>();
    }


    /** Create getters and setters for all fields.*/
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getFeeFromPerSale() {
        return feeFromPerSale;
    }

    public void setFeeFromPerSale(double feeFromPerSale) {
        this.feeFromPerSale = feeFromPerSale;
    }

    /** Create a void addProduct method with a Product product parameter.
      In this method set productSeller to this and add the product to products list.*/
    public void addProduct(Product product){
        product.setSeller(product.getSeller());
        products.add(product);
}

    /**
     * Create abstract sellProduct method with a Product product parameter.
     */
    public abstract void sellProduct(Product product);


}
