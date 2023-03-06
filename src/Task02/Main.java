package Task02;

import java.util.Scanner;


/**
 * The class Main
 */
public class Main {

    /**
     * Main
     *
     * @param args the args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calculator cl;
        while (true) {
            try {
                cl = new Calculator();
                cl.ShowInfo();
                System.out.println("Ведіть розмір сторони у основи: ");
                double side = in.nextDouble();
                System.out.println("Ведіть розмір основи: ");
                double baseSide = in.nextDouble();
                cl.SetSideAndBaseSide(side, baseSide);
                System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + cl.CountOnesInBinary());
            } catch (Exception ex) {
                System.out.println(ex);
            }
            System.out.println("/--------------------------------------------------------------------------------------------------/");
        }
    }
}
