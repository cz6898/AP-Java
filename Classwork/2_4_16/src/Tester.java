/**
 * Created by Chairman Zhao on 2/4/2016.
 */
public class Tester {
    public static int test(MathFunctions m){
        m.setA(3);
        m.setB(5);
        m.process();
        return m.getResult();
    }
    public static void main(String[] args){
        System.out.println(test(new Adder()));
        System.out.println(test(new Multiplier()));
    }
}
