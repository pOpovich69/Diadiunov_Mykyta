package Task05.Commands;

import Task03.History;
import Task05.ICommand;
import Task02.Storage;


public class LastDataInHistoryCommand implements ICommand {

    private History history;

    public LastDataInHistoryCommand(History history) throws Exception {
        this.history = history;
    }
    @Override
    public int GetKey() {
        return 3;
    }

    @Override
    public void PerformCommand() {
        System.out.println("1) Розміу сторони у основи останьго запису");
        System.out.println("2) Розмір основи останьго запису");
        System.out.println("3) Периметр трикутника останьго запису");
        System.out.println("4) Периметр прямокутника останьго запису");
        System.out.println("5) Сума периметрів останьго запису");
        System.out.println("6) Кількість 1 у двійковому поданні цілої частини значення суми периметрів останьго запису");
        System.out.println("7) Подивитись історію всіх даних останьго запису");
        System.out.println("Ведіть 0 якщо хочете вийти");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        System.out.println();
        if(answer > 6){
            history.ShowLastDataInHistory();
        }
        else if(answer <= 0){
            return;
        }
        else{
            history.ShowLastDataInHistory(answer);
        }
    }
}
