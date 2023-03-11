package Task05;

import Task02.Storage;
import Task03.History;
import Task05.Commands.CalculatorCommand;
import Task05.Commands.HistoryCommand;
import Task05.Commands.LastDataInHistoryCommand;
import Task06.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

    private Scanner in = new Scanner(System.in);
    private ArrayList<ICommand> commands;
    private History history;
    private Storage storage;
    private static Menu menu;

    private Menu(){
        try {
            storage = new Storage();
            history = (History) storage.Load(new History());

            commands = new ArrayList<ICommand>();
            commands.add(new CalculatorCommand(history));
            commands.add(new HistoryCommand(history));
            commands.add(new LastDataInHistoryCommand(history));
            commands.add(new MaxDataCommand(history));
            commands.add(new MinDataCommand(history));
            commands.add(new AvgDataCommand(history));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static Menu Initialize(){
        if(menu != null) {
            return menu;
        }
        menu = new Menu();
        return menu;
    }
    public void StartMenu(){
        System.out.println("/---------------------Menu---------------------/");
        System.out.println("1) Старт програми");
        System.out.println("2) Подивитись історію");
        System.out.println("3) Подивитись остані дані в історії");
        System.out.println("4) Подивитись максимальні дані в історії");
        System.out.println("5) Подивитись мінімальні дані в історії");
        System.out.println("6) Подивитись середні дані в історії");
        System.out.println("Ведіть 0 якщо хочете вийти");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        for (var command : commands){
            if(answer == command.GetKey()){
                command.PerformCommand();
            }
        }
    }
}
