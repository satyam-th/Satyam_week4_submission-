class Seat {
    protected String seatNumber;
   

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void bookSeat() {
        System.out.println("seat is book");
    }

  
}

// RegularSeat subclass: booking allowed any time
class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }
     @Override
     public void bookSeat(){
        System.err.println("your regularseat is book with seatnumber :" + this.seatNumber);
     }

}

// PremiumSeat subclass: booking includes snack and luxury tax
class PremiumSeat extends Seat {
    private boolean snackIncluded;
    private double luxuryTax;

    public PremiumSeat(String seatNumber, double luxuryTax) {
        super(seatNumber);
        this.snackIncluded = true;
        this.luxuryTax = luxuryTax;
    }
    

    
   

    @Override
    public void bookSeat() {
     
            System.out.println("Premium seat already booked. seatnumber: "+ this.seatNumber + " also snack included " + (this.snackIncluded ? "Yes" : "No")  + " also the luxury tax is " + this.luxuryTax);
}}


public class TheaterBooking {
     public static void main(String[] args) {
       
        RegularSeat regularSeat = new RegularSeat("A10");
        regularSeat.bookSeat();

        
        PremiumSeat premiumSeat = new PremiumSeat("B5", 50.0);
        premiumSeat.bookSeat();
    }
     

}
