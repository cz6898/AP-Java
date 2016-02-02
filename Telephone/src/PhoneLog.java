import java.util.ArrayList;

/**
 * Created by Chairman Zhao on 2/2/2016.
 */
public class PhoneLog {
    public static void main(String[] args){
        ArrayList<PhoneCall> calls = new ArrayList<PhoneCall>(3);
        calls.add(new LocalCall(10, 2.5));
        calls.add(new LongDistanceCall(3));
        calls.add(new LongDistanceReducedRate(8));
        for(PhoneCall call : calls){
            System.out.println(call);
        }
    }
}
