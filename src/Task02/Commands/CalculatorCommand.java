package Task02.Commands;

import Task02.Calculator;
import Task02.Interfaces.ICommand;

public class CalculatorCommand implements ICommand {

    private Calculator calculator;

    public CalculatorCommand() throws Exception {
        calculator = new Calculator();
    }

    @Override
    public int GetKey() {
        return 1;
    }
    @Override
    public void PerformCommand() {
        try {
            System.out.println("Ведіть розмір сторони у основи: ");
            double side = in.nextDouble();
            System.out.println("Ведіть розмір основи: ");
            double baseSide = in.nextDouble();
            calculator.SetSideAndBaseSide(side, baseSide);
            System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + calculator.CountOnesInBinary());
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
