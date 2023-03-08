package Task02;

import Task02.Interfaces.IData;

import java.io.Serializable;


/**
 * The class Data implements serializable and IData
 */
public class Data  implements Serializable, IData {
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
    /**
     *
     * Show info
     *
     */
    public void ShowInfo(){

        System.out.println("Розмір сторони у основи минулого разу: " + lastSide);
        System.out.println("Розмір основи минулого разу: " + lastBaseSide);
        System.out.println("Периметр трикотника минулого разу: " + lastTrianglePerimeter);
        System.out.println("Периметр прямокутника минулого разу: " + lastRectanglePerimeter);
        System.out.println("Сума периметрів минулого разу: " + lastSumOfPerimeters);
        System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів минулого разу: " + lastCount);
    }

    @Override
    public void ReturnDataOnIndex(int index){
        switch (index){
            case(1):
                System.out.println("Розмір сторони у основи минулого разу: " + lastSide);
                break;
            case(2):
                System.out.println("Розмір основи минулого разу: " + lastBaseSide);
                break;
            case(3):
                System.out.println("Периметр трикотника минулого разу: " + lastTrianglePerimeter);
                break;
            case(4):
                System.out.println("Периметр прямокутника минулого разу: " + lastRectanglePerimeter);
                break;
            case(5):
                System.out.println("Сума периметрів минулого разу: " + lastSumOfPerimeters);
                break;
            case(6):
                System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів минулого разу: " + lastCount);
                break;
            default:
                System.out.println("Index out of the range!");
                break;
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
