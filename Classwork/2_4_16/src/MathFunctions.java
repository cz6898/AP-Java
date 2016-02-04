/**
 * Created by Chairman Zhao on 2/4/2016.
 */
public abstract class MathFunctions {
    protected int aVal, bVal, result;
    public void setA(int a){
        aVal = a;
    }
    public void setB(int b){
        bVal = b;
    }
    public abstract void process();
    public int getResult(){
        return result;
    }
}
