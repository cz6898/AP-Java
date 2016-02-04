/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public abstract class Ticket {
    protected int ticketId;
    private static int count = 0;
    public Ticket() {
        ticketId = getNextTicketId();
    }

    public abstract double getPrice();
    public String toString() {
        return "Number: " + ticketId + " Price: " +getPrice();
    }
    private static int getNextTicketId(){
        count++;
        return count;
    }
}