public class HouseKeeping implements HotelService {

    private String roomNumber;

    public HouseKeeping(String roomNumber) {

        this.roomNumber = roomNumber;
    }

    @Override
    public void performService() {
        
        System.out.println("Housekeeping cleaning room number: " + roomNumber);
    }
}
