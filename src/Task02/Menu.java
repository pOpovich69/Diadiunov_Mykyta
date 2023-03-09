package Task02;

import Task02.Commands.CalculatorCommand;
import Task02.Commands.HistoryCommand;
import Task02.Commands.LastDataInHistoryCommand;
import Task02.Interfaces.ICommand;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

    private Scanner in = new Scanner(System.in);
    private ArrayList<ICommand> commands;
    private static Menu menu;

    private Menu(){
        commands = new ArrayList<ICommand>();
        try {
            commands.add(new CalculatorCommand());
            commands.add(new HistoryCommand());
            commands.add(new LastDataInHistoryCommand());
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
        System.out.println("---------------------Menu---------------------");
        System.out.println("1) Старт програми\n2) Подивитись історію\n3) Подивитись остані дані в історії\nВедіть 0 якщо хочете вийти\n");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        for (var command : commands){
            if(answer == command.GetKey()){
                command.PerformCommand();
            }
        }
    }
}
