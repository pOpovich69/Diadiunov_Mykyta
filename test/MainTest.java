import Task02.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import java.io.IOException;
public class MainTest {
    Calculator cl;
    @Test
    public void TestCalc(){
        try {
            cl = new Calculator();
            cl.SetSideAndBaseSide(6,8);
            assertEquals(2, cl.CountOnesInBinary());
            cl.SetSideAndBaseSide(7,6);
            assertEquals(4, cl.CountOnesInBinary());
            cl.SetSideAndBaseSide(4,3);
            assertEquals(3, cl.CountOnesInBinary());
            cl.SetSideAndBaseSide(2,1);
            assertEquals(3, cl.CountOnesInBinary());
            cl.SetSideAndBaseSide(8,5);
            assertEquals(5, cl.CountOnesInBinary());

        }catch (Exception e){}
    }
    @Test
    public void TestSave(){
        try {
            cl = new Calculator();


        }catch (Exception e){}
    }

}
