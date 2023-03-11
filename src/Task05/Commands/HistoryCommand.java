package Task05.Commands;

import Task03.History;
import Task05.ICommand;
import Task02.Storage;

public class HistoryCommand implements ICommand {

    private History history;

    public HistoryCommand(History history) throws Exception {
        this.history = history;
    }

    @Override
    public int GetKey() {
        return 2;
    }

    @Override
    public void PerformCommand() {
        System.out.println("1) Подивитись історію розмірів сторони у основи");
        System.out.println("2) Подивитись історію розмірів основи");
        System.out.println("3) Подивитись історію периметрів трикутників");
        System.out.println("4) Подивитись історію периметрів прямокутників");
        System.out.println("5) Подивитись історію суми периметрів");
        System.out.println("6) Подивитись історію кількості 1 у двійковому поданні цілої частини значення суми периметрів");
        System.out.println("7) Подивитись історію всіх даних");
        System.out.println("Ведіть 0 якщо хочете вийти");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        System.out.println();
        if(answer > 6){
            history.ViewHistory();
        }
        else if(answer <= 0){
            return;
        }
        else{
            history.ViewHistory(answer);
        }
    }
}
