package Task06;

import Task03.History;
import Task05.ICommand;

public class MinDataCommand implements ICommand {

    private History history;
    public MinDataCommand(History history) {
        this.history = history;
    }
    @Override
    public int GetKey() {
        return 5;
    }
    @Override
    public void PerformCommand() {
        System.out.println("1) Розмір сторони у основи");
        System.out.println("2) Розмір основи");
        System.out.println("3) Периметр трикутника");
        System.out.println("4) Периметр прямокутника");
        System.out.println("5) Сума периметрів");
        System.out.println("6) Кількість 1 у двійковому поданні цілої частини значення суми периметрів");
        System.out.println("Ведіть 0 якщо хочете вийти");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        switch (answer){
            case 1:
                MinSide();
                break;
            case 2:
                MinBaseSide();
                break;
            case 3:
                MinTrianglePerimeter();
                break;
            case 4:
                MinRectanglePerimeter();
                break;
            case 5:
                MinSumOfPerimeters();
                break;
            case 6:
                MinCount();
                break;
            case 0:
                return;
        }
        System.out.println();
    }
    private void MinSide(){
        double min = history.dataHistory.get(0).getLastSide();
        for(var i:history.dataHistory){
            if(i.getLastSide() > min){
                min = i.getLastSide();
            }
        }
        System.out.println("Найменьший розміу сторони у основи: " + min);
    }
    private void MinBaseSide(){
        double min = history.dataHistory.get(0).getLastBaseSide();
        for(var i:history.dataHistory){
            if(i.getLastBaseSide() < min){
                min = i.getLastBaseSide();
            }
        }
        System.out.println("Найменьший розмір основи: " + min);
    }
    private void MinTrianglePerimeter(){
        double min = history.dataHistory.get(0).getLastTrianglePerimeter();
        for(var i:history.dataHistory){
            if(i.getLastTrianglePerimeter() < min){
                min = i.getLastTrianglePerimeter();
            }
        }
        System.out.println("Найменьший периметр трикутника: " + min);
    }
    private void MinRectanglePerimeter(){
        double min = history.dataHistory.get(0).getLastRectanglePerimeter();
        for(var i:history.dataHistory){
            if(i.getLastRectanglePerimeter() < min){
                min = i.getLastRectanglePerimeter();
            }
        }
        System.out.println("Найменьший периметр прямокутника: " + min);
    }
    private void MinSumOfPerimeters(){
        double min = history.dataHistory.get(0).getLastSumOfPerimeters();
        for(var i:history.dataHistory){
            if(i.getLastSumOfPerimeters() < min){
                min = i.getLastSumOfPerimeters();
            }
        }
        System.out.println("Найменьший сума периметрів: " + min);
    }
    private void MinCount(){
        double min = history.dataHistory.get(0).getLastCount();
        for(var i:history.dataHistory){
            if(i.getLastCount() < min){
                min = i.getLastCount();
            }
        }
        System.out.println("Найменьший кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + min);
    }
}
