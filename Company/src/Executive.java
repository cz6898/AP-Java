/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class Executive extends Employee{
    public Executive(String n, String addr, String p, String s, double pay){
        super(n, addr, p, s, pay);
    }
    public void awardBonus(double b){
        paid += b;
    }
}
