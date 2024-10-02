public class Cart implements HotelService {

    private int numberOfCarts;

    public Cart(int numberOfCarts) {

        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService() {

        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }
}
