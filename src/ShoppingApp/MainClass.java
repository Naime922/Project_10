package ShoppingApp;

public class MainClass {
    public static void main(String[] args) {
        /** Create abjects of all Types of Seller,
         * Create objects of Product and add them to product list of sellers
         * Create all types of Buyers
         * add products to their cart and call checkOut methods.
         * Check if the results are correct*/

        Seller seller1=new RegularSeller("amazon","NYC");
        Seller seller2=new PremiumSeller("google","LA");

        Product product1=new Product("phone",12.00,10);
        Product product2=new Product("laptop",120.00,30);
        Product product3=new Product("cable",10.00,10);
        Product product4=new Product("headphone",120.00,10);
        Product product5=new Product("air tag",100.00,10);

        seller1.addProduct(product1);
        seller1.addProduct(product2);
        seller2.addProduct(product3);
        seller2.addProduct(product4);
        seller2.addProduct(product5);


        Buyer premBuyer=new PremiumBuyer("nebahat","PA");
        Buyer regBuyer=new RegularBuyer("Ipek","TX");
        Buyer regBuyer2=new RegularBuyer("Utkucan","TX");

        premBuyer.addToCart(product1);
        premBuyer.addToCart(product2);
        regBuyer.addToCart(product3);
        regBuyer.addToCart(product4);
        regBuyer.addToCart(product5);
        regBuyer2.addToCart(product3);
        regBuyer2.addToCart(product1);

        premBuyer.checkOut(PaymentMethod.CASHonDELIVERY);
        regBuyer.checkOut(PaymentMethod.CREDITCARD);
        regBuyer2.checkOut(PaymentMethod.CREDITCARD);

        seller1.sellProduct(product1);
        System.out.println(product1.getStock()); //2 buyers bought this product and this seller sold one; stock=7
        System.out.println(seller1.getBalance()); //sold a product the price is 12.0, reduced the saleFee 1.2; balance=10.8

        //regular buyer's cart and balance
        System.out.println(regBuyer.getCart());
        //regular buyer's balance
        System.out.println(regBuyer.getCart().getTotal());
        //remove an item from cart
        regBuyer.removeFromCard(product3);
        //see the balance after removal
        System.out.println(regBuyer.getCart().getTotal());

        //see al stock of items seller1 has;
        for (Product product: seller1.getProducts()) {
            System.out.println(product.getStock());
        }


    }
}
