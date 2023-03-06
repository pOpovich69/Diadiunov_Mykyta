package Task02;

import java.io.IOException;


/**
 * The class Calculator
 */
public class Calculator {
    private int count;
    private double Side;
    private double BaseSide;
    private Storage storage;
    private Data data;


    /**
     *
     * It is a constructor.
     *
     * @throws   Exception
     */
    public Calculator() throws Exception{

        storage = new Storage();
        data = (Data)storage.Load(new Data());
    }
    /**
     *
     * Count ones in binary
     *
     * @return int
     * @throws   IOException
     */
    public int CountOnesInBinary() throws IOException {

        data.SetLastSide(this.Side);
        data.SetLastBaseSide(this.BaseSide);
        String numberInBinary = NumberInBinary((int)SumOfPerimeters());
        char[] c = numberInBinary.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] =='1'){
                count++;
            }
        }
        data.SetLastCount(count);
        storage.Save(data);
        return count;
    }
    /**
     *
     * Show all info
     *
     */
    public void ShowInfo(){

        data.ShowInfo();
        System.out.println("/--------------------------------------------------------------------------------------------------/");
    }
    /**
     *
     * Set side and base side
     *
     * @param side  the side
     * @param baseSide  the base side
     * @throws   Exception
     */
    public void SetSideAndBaseSide(double side, double baseSide) throws Exception{
        if(side <= 0 || baseSide <= 0 || side == baseSide){
            throw new Exception("Сторона не повинна бути менша за нуль та не повині бути однаковими!");
        }
        else {
            if((side * 2) < baseSide){
                throw new Exception("Сума двох сторін не повинна бути менша за третю!");
            }
            else {
                this.Side = side;
                this.BaseSide = baseSide;
            }
        }
    }
    /**
     *
     * Sum of perimeters
     *
     * @return double
     */
    private double SumOfPerimeters(){
        double result = InitializeRectanglePerimeter() + InitializeTrianglePerimeter();
        data.SetLastSumOfPerimeters(result);
        return result;
    }

    /**
     *
     * Number in binary
     *
     * @param number  the number
     * @return String
     */
    private String NumberInBinary(int number){
        byte b = (byte)number;
        int i = Byte.toUnsignedInt(b);
        String str = String.format("%8s", Integer.toBinaryString(i)).replaceAll(" ", "0");
        return str;
    }

    /**
     *
     * Initialize triangle perimeter
     *
     * @return double
     */
    private double InitializeTrianglePerimeter(){
        double result = ((this.Side * 2) + this.BaseSide);
        data.SetLastTrianglePerimeter(result);
        return result;
    }

    /**
     *
     * Initialize rectangle perimeter
     *
     * @return double
     */
    private double InitializeRectanglePerimeter(){
        double result = ((this.Side * 2) + (this.BaseSide * 2));
        data.SetLastRectanglePerimeter(result);
        return result;
    }
}
