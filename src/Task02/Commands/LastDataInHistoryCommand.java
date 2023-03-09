package Task02.Commands;

import Task02.History;
import Task02.Interfaces.ICommand;
import Task02.Storage;


public class LastDataInHistoryCommand implements ICommand {

    private History history;

    public LastDataInHistoryCommand() throws Exception {
        Storage storage = new Storage();
        history = (History) storage.Load(new History());
    }
    @Override
    public int GetKey() {
        return 3;
    }

    @Override
    public void PerformCommand() {
        System.out.println("1) Подивитись історію розмірів сторони у основи\n2) Подивитись історію розмірів основи\n3) Подивитись історію периметрів трикутників\n4) Подивитись історію периметрів прямокутників\n5) Подивитись історію суми периметрів\n6) Подивитись історію суми периметрів\n7) Подивитись історію всіх даних\nВедіть 0 якщо хочете вийти\n");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        if(answer > 6){
            history.ViewHistory(answer);
        }
        else if(answer == 0){
            return;
        }
        else{
            history.ViewHistory(answer);
        }
    }
}
