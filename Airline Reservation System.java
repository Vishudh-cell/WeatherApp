public class AirlineReservationSystem {
    
    public class Flight{
        String flightNumber;
        int availableSeats;

        public Flight(String flightNumber, int availableSeats){
            this.flightNumber = flightNumber;
            this.availableSeats = availableSeats;
        }

        public int bookSeat(int availableSeats){
            availableSeats--;
        }

        public void displayFlightDetails(){
            System.out.println("Flightnumber is "+ flightNumber);
            System.out.println("Availableseats are "+ availableSeats);
        }
    }

    public class Airline{
        String name;
        List<Flight> flights;
        
        public Airline(String name, List<Flight> flights){
            this.name = name;
            this.flights = flights;
        }

        public int addFlight(String flightNumber, int availableSeats){
            flights.add(flightNumber, availableSeats);
        }

        public void displayFlights(){
            System.out.println(flights);
            return;
        }

        public int getFlight(String flightNumber){
            
        }
    }

    public class Passenger{
        String name;
        int contactNumber;

        public void displayPassengerDetails(){
            System.out.println(name, contactNumber)
            return;
        }
    }

    public class Reservation{

    }

}
