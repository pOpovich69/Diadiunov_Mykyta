package Task06;

import Task02.Data;
import Task03.History;
import Task05.ICommand;

public class MaxDataCommand implements ICommand {

    private History history;

    public MaxDataCommand(History history) {
        this.history = history;
    }

    @Override
    public int GetKey() {
        return 4;
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
                MaxSide();
                break;
            case 2:
                MaxBaseSide();
                break;
            case 3:
                MaxTrianglePerimeter();
                break;
            case 4:
                MaxRectanglePerimeter();
                break;
            case 5:
                MaxSumOfPerimeters();
                break;
            case 6:
                MaxCount();
                break;
            case 0:
                return;

        }
        System.out.println();
    }
    private void MaxSide(){
        double max = history.dataHistory.get(0).getLastSide();
        for(var i:history.dataHistory){
            if(i.getLastSide() > max){
                max = i.getLastSide();
            }
        }
        System.out.println("Найбільший розмір сторони у основи: " + max);
    }
    private void MaxBaseSide(){
        double max = history.dataHistory.get(0).getLastBaseSide();
        for(var i:history.dataHistory){
            if(i.getLastBaseSide() > max){
                max = i.getLastBaseSide();
            }
        }
        System.out.println("Найбільший розмір основи: " + max);
    }
    private void MaxTrianglePerimeter(){
        double max = history.dataHistory.get(0).getLastTrianglePerimeter();
        for(var i:history.dataHistory){
            if(i.getLastTrianglePerimeter() > max){
                max = i.getLastTrianglePerimeter();
            }
        }
        System.out.println("Найбільший периметр трикутника: " + max);
    }
    private void MaxRectanglePerimeter(){
        double max = history.dataHistory.get(0).getLastRectanglePerimeter();
        for(var i:history.dataHistory){
            if(i.getLastRectanglePerimeter() > max){
                max = i.getLastRectanglePerimeter();
            }
        }
        System.out.println("Найбільший периметр прямокутника: " + max);
    }
    private void MaxSumOfPerimeters(){
        double max = history.dataHistory.get(0).getLastSumOfPerimeters();
        for(var i:history.dataHistory){
            if(i.getLastSumOfPerimeters() > max){
                max = i.getLastSumOfPerimeters();
            }
        }
        System.out.println("Найбільша сума периметрів: " + max);
    }
    private void MaxCount(){
        double max = history.dataHistory.get(0).getLastCount();
        for(var i:history.dataHistory){
            if(i.getLastCount() > max){
                max = i.getLastCount();
            }
        }
        System.out.println("Найбільша кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + max);
    }
}
