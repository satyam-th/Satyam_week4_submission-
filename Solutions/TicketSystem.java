class Ticket{

    private Double price;
    private String ticketNumber;

    public Ticket(Double price, String ticketNumber) {
        this.price = price;
        this.ticketNumber = ticketNumber;
    }
    //getting generateTicket
    public String generateTicket() {
        return "Ticket Number: " + ticketNumber + ", Price: rs" + price;
    }
}

class BusTicket extends Ticket {
    private String SeatNumber;

    public BusTicket(Double price, String ticketNumber, String seatNumber) {
        super(price, ticketNumber);
        this.SeatNumber = seatNumber;
    }
    @Override
    public String generateTicket() {
        return super.generateTicket() + ", Seat Number: " + SeatNumber;
    }
}

class TrainTicket extends Ticket {
    private String coachType;

    public TrainTicket(Double price, String ticketNumber, String coachType) {
        super(price, ticketNumber);
        this.coachType = coachType;
    }
    @Override
    public String generateTicket() {
        return super.generateTicket() + ", Coach Type: " + coachType;
    }
}

class  FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(Double price, String ticketNumber, String boardingGate) {
        super(price, ticketNumber);
        this.boardingGate = boardingGate;
    }
    @Override
    public String generateTicket() {
        return super.generateTicket() + ", Boarding Gate: " + boardingGate;
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[3];
        tickets[0] = new BusTicket(500.0, "02ba123", "A1");
        tickets[1] = new TrainTicket(1000.0, "T001", "abc");
        tickets[2] = new FlightTicket(5000.0, "F001", "Gate 5");
        for (Ticket ticket : tickets) {
            System.out.println(ticket.generateTicket());
        }
    }
    
}
