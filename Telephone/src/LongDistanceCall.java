/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class LongDistanceCall extends PhoneCall{
    public LongDistanceCall(int d){
        super(d);
    }
    public double getRate(){
        return 6.0;
    }
    public String toString(){
        return super.toString() + " LD";
    }
}
