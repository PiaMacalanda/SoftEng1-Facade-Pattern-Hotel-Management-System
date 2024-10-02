public class Valet implements HotelService {

    private String plateNumber;

    public Valet(String plateNumber) {

        this.plateNumber = plateNumber;
    }

    @Override
    public void performService() {
        
        System.out.println("Valet picking up vehicle with plate number: " + plateNumber);
    }
}
