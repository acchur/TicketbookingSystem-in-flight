package reservationsystem;

public class main {
    public static void main(String[] args){
        Passanger passanger = new Passanger("10023"," Bnaglore","7356435883");

        Address address = new Address("Rajivnagar","bangalore","Karnataka");
        Contact contact=new Contact();
        Flight flight=new Flight("A013","JAI jet","80%","100");
        RegularTickets regularTickets=new RegularTickets("food-water-snacks");
        TouristTickets touristTickets=new TouristTickets("pune");

        System.out.println("get contact details"+passanger.getContact());
        System.out.println("get contact details"+flight.getFlightDetails());
        System.out.println("The seat avalability :" +flight.checkAvalability());
        System.out.println("print ticket details"+ticket.ticketDetails());
    }

}
