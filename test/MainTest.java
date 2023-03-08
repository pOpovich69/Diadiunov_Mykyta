import Task02.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import java.io.IOException;
public class MainTest {
    Calculator cl;
    @Test
    public void Test(){
        try {
            cl = new Calculator();

            assertEquals(0, cl.MethodForTest());

            cl.SetSideAndBaseSide(6,8);
            assertEquals(2, cl.CountOnesInBinary());

            assertEquals(1, cl.MethodForTest());

            cl.SetSideAndBaseSide(7,6);
            assertEquals(4, cl.CountOnesInBinary());

            assertEquals(2, cl.MethodForTest());

            cl.SetSideAndBaseSide(4,3);
            assertEquals(3, cl.CountOnesInBinary());

            assertEquals(3, cl.MethodForTest());

            cl.SetSideAndBaseSide(2,1);
            assertEquals(3, cl.CountOnesInBinary());

            assertEquals(4, cl.MethodForTest());

            cl.SetSideAndBaseSide(8,5);
            assertEquals(5, cl.CountOnesInBinary());

            assertEquals(5, cl.MethodForTest());

        }catch (Exception e){}
    }
}
