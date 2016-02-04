/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class Hourly extends Employee{
    private int hours;
    public Hourly(String n, String addr, String p, String s, double wr){
        super(n, addr, p, s, wr);
    }
    public void addHours(int h){
        paid *= h;
        hours = h;
    }
    public String toString(){
        return super.toString() + "\nHours: " + hours;
    }
}
