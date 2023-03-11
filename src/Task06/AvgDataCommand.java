package Task06;

import Task03.History;
import Task05.ICommand;

public class AvgDataCommand implements ICommand {

    private History history;

    public AvgDataCommand(History history) {
        this.history = history;
    }
    @Override
    public int GetKey() {
        return 6;
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
                AvgSide();
                break;
            case 2:
                AvgBaseSide();
                break;
            case 3:
                AvgTrianglePerimeter();
                break;
            case 4:
                AvgRectanglePerimeter();
                break;
            case 5:
                AvgSumOfPerimeters();
                break;
            case 6:
                AvgCount();
                break;
            case 0:
                return;

        }
        System.out.println();
    }
    private void AvgSide(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
                avg += i.getLastSide();
                count++;
        }
        avg /= count;
        System.out.println("Середній розмір сторони у основи: " + avg);
    }
    private void AvgBaseSide(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
            avg += i.getLastBaseSide();
            count++;
        }
        avg /= count;
        System.out.println("Середній розмір основи: " + avg);
    }
    private void AvgTrianglePerimeter(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
            avg += i.getLastTrianglePerimeter();
            count++;
        }
        avg /= count;
        System.out.println("Середній периметр трикутника: " + avg);
    }
    private void AvgRectanglePerimeter(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
            avg += i.getLastRectanglePerimeter();
            count++;
        }
        avg /= count;
        System.out.println("Середній периметр прямокутника: " + avg);
    }
    private void AvgSumOfPerimeters(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
            avg += i.getLastSumOfPerimeters();
            count++;
        }
        avg /= count;
        System.out.println("Середня сума периметрів: " + avg);
    }
    private void AvgCount(){
        double avg = 0;
        int count = 0;
        for(var i:history.dataHistory){
            avg += i.getLastCount();
            count++;
        }
        avg /= count;
        System.out.println("Середня кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + avg);
    }
}
