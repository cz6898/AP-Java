/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class LongDistanceReducedRate extends LongDistanceCall{
    public LongDistanceReducedRate(int d){
        super(d);
    }
    public double getRate(){
        return super.getRate()/2.0;
    }
    public String toString(){
        return super.toString() + "RR";
    }
}
