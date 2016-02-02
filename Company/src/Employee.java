/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class Employee extends StaffMember{
    protected String social;
    //protected double paid;
    public Employee(){

    }
    public Employee(String n, String addr, String p, String s, double pay){
        name = n;
        address = addr;
        phone = p;
        social = s;
        paid = pay;
    }
    public String toString(){
        return super.toString() + "\nSocial Security Number: " + social;
    }
}
