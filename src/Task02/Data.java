package Task02;


import java.io.Serializable;


/**
 * The class Data implements serializable and IData
 */
public class Data  implements Serializable {
    private double lastSide;
    private double lastBaseSide;
    private double lastTrianglePerimeter;
    private double lastRectanglePerimeter;
    private double lastSumOfPerimeters;
    private int lastCount;

    public Data(double lastSide, double lastBaseSide, double lastTrianglePerimeter, double lastRectanglePerimeter, double lastSumOfPerimeters, int lastCount) {
        this.lastSide = lastSide;
        this.lastBaseSide = lastBaseSide;
        this.lastTrianglePerimeter = lastTrianglePerimeter;
        this.lastRectanglePerimeter = lastRectanglePerimeter;
        this.lastSumOfPerimeters = lastSumOfPerimeters;
        this.lastCount = lastCount;
    }
    public String ReturnDataOnIndex(int index) throws Exception{
        switch (index){
            case(1):
               return "Розмір сторони у основи: " + lastSide;
            case(2):
                return "Розмір основи: " + lastBaseSide;
            case(3):
                return "Периметр трикутника: " + lastTrianglePerimeter;
            case(4):
                return "Периметр прямокутника: " + lastRectanglePerimeter;
            case(5):
                return "Сума периметрів: " + lastSumOfPerimeters;
            case(6):
                return "Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + lastCount;
            default:
                throw new Exception("Error!");
        }
    }
    public double getLastSide() {
        return lastSide;
    }
    public double getLastBaseSide() {
        return lastBaseSide;
    }

    public double getLastTrianglePerimeter() {
        return lastTrianglePerimeter;
    }

    public double getLastRectanglePerimeter() {
        return lastRectanglePerimeter;
    }

    public double getLastSumOfPerimeters() {
        return lastSumOfPerimeters;
    }

    public int getLastCount() {
        return lastCount;
    }
}
