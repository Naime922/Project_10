package ShoppingApp;

import java.util.ArrayList;
import java.util.List;

/** This class has
 *              private double total variable and
 *              private list of products named cartProducts
 * Create a constructor with no parameters. In the constructor
 *              set total to 0.
 *              initialize the list
 *
 * Create all getters and setters
 *
 * In setTotal method increment balance by the value you are getting as parameter
 */

public class Cart {
    private double total;
    private List<Product> cartProduct;

    public Cart() {
        total=0;
        cartProduct=new ArrayList<>();

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Product> getCartProduct() {
        return cartProduct;
    }

    public void setCartProduct(List<Product> cartProduct) {
        this.cartProduct = cartProduct;
    }


}
