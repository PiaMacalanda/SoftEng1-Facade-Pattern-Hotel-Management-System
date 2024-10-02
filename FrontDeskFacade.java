public class FrontDeskFacade {

    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDeskFacade(String plateNumber, String roomNumber, int numberOfCarts) {

        this.valet = new Valet(plateNumber);
        this.houseKeeping = new HouseKeeping(roomNumber);
        this.cart = new Cart(numberOfCarts);
    }

    public void requestValetService() {

        valet.performService();
    }

    public void requestHouseKeepingService() {

        houseKeeping.performService();
    }

    public void requestCartService() {
        
        cart.performService();
    }
}
