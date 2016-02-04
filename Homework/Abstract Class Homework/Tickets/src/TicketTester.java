import java.util.ArrayList;

/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class TicketTester {
    public static void main(String[] args){
        ArrayList<Ticket> ticketSales = new ArrayList<Ticket>(5);
        ticketSales.add(new WalkIn());
        ticketSales.add(new Reserved(11));
        ticketSales.add(new Reserved(9));
        ticketSales.add(new StudentReserved(5));
        ticketSales.add(new StudentReserved(12));
        for(Ticket t : ticketSales){
            System.out.println(t);
        }
    }
}
