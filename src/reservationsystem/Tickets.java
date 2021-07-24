package reservationsystem;

public abstract class Tickets {
    private String pnno;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalTime;
    private Passanger passanger;
    private float price;
    private boolean cancelled;

    public Tickets(String pnno,String from,String to,Flight flight,String departureDateTime,
                   String arrivalTime,Passanger passanger,float price,boolean cancelled){
        this.pnno=pnno;
       this.from=from;
        this.to=to;
        this.flight=flight;
       this.departureDateTime=departureDateTime;
        this.arrivalTime=arrivalTime;
       this.passanger=passanger;
        this.price=price;
        this.cancelled=true;

       public void cancell(){
           System.out.println("cancelled the ticket");
    }
     public String printTicketDetails(Ticket ticket){
           System.out.println("PNNO"+pnno);
            System.out.println("From"+from);
            System.out.println("To"+to);
            System.out.println("Departure date and time"+departureDateTime);
            System.out.println("Arrival Time"+arrivalTime);
            System.out.println("The price of the ticket"+price);

        }
}
