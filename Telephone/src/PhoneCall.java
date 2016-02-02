/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public abstract class PhoneCall{
    protected int duration;
    //protected double rate;
    public PhoneCall(int d){
        duration = d;
    }
    public int getDuration(){
        return duration;
    }
    public abstract double getRate();
    private int totalCost(){
        return (int) (duration * getRate());
    }
    public String toString(){
        return "Duration " + duration + " Rate " + getRate() + " Total " + totalCost();
    }
}
