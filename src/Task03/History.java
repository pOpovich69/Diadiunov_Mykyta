package Task03;

import Task02.Data;


import java.io.Serializable;
import java.util.ArrayList;

public class History implements Serializable {
    public ArrayList<Data> dataHistory;

    public History() {
        dataHistory = new ArrayList<Data>();
    }
    public void ShowLastDataInHistory(){
            System.out.println("Розмір сторони у основи: " + dataHistory.get(dataHistory.size()-1).getLastBaseSide());
            System.out.println("Розмір основи: " + dataHistory.get(dataHistory.size()-1).getLastSide());
            System.out.println("Периметр трикутника: " + dataHistory.get(dataHistory.size()-1).getLastTrianglePerimeter());
            System.out.println("Периметр прямокутника: " + dataHistory.get(dataHistory.size()-1).getLastRectanglePerimeter());
            System.out.println("Сума периметрів: " + dataHistory.get(dataHistory.size()-1).getLastSumOfPerimeters());
            System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + dataHistory.get(dataHistory.size()-1).getLastCount());
            System.out.println("/---------------------------------------------------------------------------------------------/");
    }
    public void ShowLastDataInHistory(int index){
        try {
            System.out.println(dataHistory.get(dataHistory.size()-1).ReturnDataOnIndex(index));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("/---------------------------------------------------------------------------------------------/");
    }
    public void ViewHistory(){
        for (var item: dataHistory){
            System.out.println("Розмір сторони у основи: " + item.getLastBaseSide());
            System.out.println("Розмір основи: " + item.getLastSide());
            System.out.println("Периметр трикотника: " + item.getLastTrianglePerimeter());
            System.out.println("Периметр прямокутника: " + item.getLastRectanglePerimeter());
            System.out.println("Сума периметрів " + item.getLastSumOfPerimeters());
            System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + item.getLastCount());
            System.out.println("/---------------------------------------------------------------------------------------------/");
        }
    }
    public void ViewHistory(int index){
        for (var item: dataHistory){
            try {
                System.out.println(item.ReturnDataOnIndex(index));
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("/------------------------------------------------------------------/");
        }
    }
    public int MethodForTest(){
        return dataHistory.size();
    }
}
