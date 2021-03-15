package stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status is: ");
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our Airlines");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
}
