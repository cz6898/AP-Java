/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class StudentReserved extends Reserved{
    public StudentReserved(int d){
        super(d);
    }
    public double getPrice(){
        return super.getPrice()/2.0;
    }
    public String toString(){
        return super.toString() + "\nA Student ID is required for this type of ticket";
    }
}
