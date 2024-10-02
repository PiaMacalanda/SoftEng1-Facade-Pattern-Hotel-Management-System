public class HotelApp {

    public static void main(String[] args) {
        
        FrontDeskFacade frontDesk = new FrontDeskFacade("ABC123", "101", 2);

        frontDesk.requestValetService();
        frontDesk.requestHouseKeepingService();
        frontDesk.requestCartService();
    }
}
