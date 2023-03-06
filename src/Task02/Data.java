package Task02;

import java.io.Serializable;


/**
 * The class Data implements serializable
 */
public class Data  implements Serializable {
    private double lastSide;
    private double lastBaseSide;
    private double lastTrianglePerimeter;
    private double lastRectanglePerimeter;
    private double lastSumOfPerimeters;
    private int lastCount;


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


    /**
     *
     * Get last side
     *
     * @return double
     */
    public double GetLastSide() {

        return lastSide;
    }

    /**
     *
     * Set last side
     *
     * @param lastSide  the last side
     */
    public void SetLastSide(double lastSide) {

        if(lastSide > 0){
            this.lastSide = lastSide;
        }
    }

    /**
     *
     * Get last base side
     *
     * @return double
     */
    public double GetLastBaseSide() {

        return lastBaseSide;
    }

    /**
     *
     * Set last base side
     *
     * @param lastBaseSide  the last base side
     */
    public void SetLastBaseSide(double lastBaseSide) {

        if(lastBaseSide > 0){
            this.lastBaseSide = lastBaseSide;
        }
    }

    /**
     *
     * Get last triangle perimeter
     *
     * @return double
     */
    public double GetLastTrianglePerimeter() {

        return lastTrianglePerimeter;
    }

    /**
     *
     * Set last triangle perimeter
     *
     * @param lastTrianglePerimeter  the last triangle perimeter
     */
    public void SetLastTrianglePerimeter(double lastTrianglePerimeter) {

        if(lastTrianglePerimeter > 0){
            this.lastTrianglePerimeter = lastTrianglePerimeter;
        }

    }

    /**
     *
     * Get last rectangle perimeter
     *
     * @return double
     */
    public double GetLastRectanglePerimeter() {

        return lastRectanglePerimeter;
    }


    /**
     *
     * Set last rectangle perimeter
     *
     * @param lastRectanglePerimeter  the last rectangle perimeter
     */
    public void SetLastRectanglePerimeter(double lastRectanglePerimeter) {

        if(lastRectanglePerimeter > 0){
            this.lastRectanglePerimeter = lastRectanglePerimeter;
        }
    }

    /**
     *
     * Get last sum of perimeters
     *
     * @return double
     */
    public double GetLastSumOfPerimeters() {

        return lastSumOfPerimeters;
    }


    /**
     *
     * Set last sum of perimeters
     *
     * @param lastSumOfPerimeters  the last sum of perimeters
     */
    public void SetLastSumOfPerimeters(double lastSumOfPerimeters) {

        if(lastSumOfPerimeters > 0){
            this.lastSumOfPerimeters = lastSumOfPerimeters;
        }
    }

    /**
     *
     * Get last count
     *
     * @return int
     */
    public int GetLastCount() {

        return lastCount;
    }

    /**
     *
     * Set last count
     *
     * @param lastCount  the last count
     */
    public void SetLastCount(int lastCount) {

        if(lastCount > 0){
            this.lastCount = lastCount;
        }
    }
}
