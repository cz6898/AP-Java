/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class LocalCall extends PhoneCall{
    private double rate;
    public LocalCall(int d, double r){
        super(d);
        rate = r;
    }
    public double getRate(){
        return rate;
    }
}
