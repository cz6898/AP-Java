/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public abstract class StaffMember {
    protected String name, address, phone;
    protected double paid;
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }
    public double pay(){
        return paid;
    }
}
