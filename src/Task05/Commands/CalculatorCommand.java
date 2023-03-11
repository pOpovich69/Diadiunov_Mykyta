package Task05.Commands;

import Task02.Calculator;
import Task03.History;
import Task05.ICommand;

public class CalculatorCommand implements ICommand {

    private Calculator calculator;

    public CalculatorCommand(History history) throws Exception {
        calculator = new Calculator(history);
    }

    @Override
    public int GetKey() {
        return 1;
    }
    @Override
    public void PerformCommand() {
        try {
            System.out.print("Ведіть розмір сторони у основи: ");
            double side = in.nextDouble();
            System.out.print("Ведіть розмір основи: ");
            double baseSide = in.nextDouble();
            calculator.SetSideAndBaseSide(side, baseSide);
            System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + calculator.CountOnesInBinary());
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
