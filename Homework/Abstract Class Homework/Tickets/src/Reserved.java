/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class Reserved extends Ticket{
    protected int dAdv;
    public Reserved(int d){
        super();
        if(dAdv <= 0)
            dAdv = 1;
        else{
            dAdv = d;
        }
    }
    public double getPrice(){
        if(dAdv >= 10)
            return 30.0;
        return 40.0;
    }
}
