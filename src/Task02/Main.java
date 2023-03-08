package Task02;

import java.util.Scanner;


/**
 * The class Main
 */
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Calculator cl;
    /**
     * Main
     *
     * @param args the args
     */
    public static void main(String[] args) {
        Main();
    }
    private static void Main(){
        int answer = 0;
        try {
            cl = new Calculator();
            do {
                System.out.println("---------------------Menu---------------------");
                System.out.println("1) Старт програми\n2) Подивитись історію\n3) Подивитись остані дані в історії\nВедіть 0 якщо хочете вийти\n");
                System.out.print("Ведіть вашу відповідь: ");
                answer = in.nextInt();
                switch (answer){
                    case 1:
                        StartProgram();
                        break;
                    case 2:
                        ViewHistory();
                        break;
                    case 3:
                        ViewLastInHistory();
                        break;
                    case 0:
                        break;
                }
            }while (answer != 0);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
    private static void StartProgram() throws Exception {
        System.out.println("Ведіть розмір сторони у основи: ");
        double side = in.nextDouble();
        System.out.println("Ведіть розмір основи: ");
        double baseSide = in.nextDouble();
        cl.SetSideAndBaseSide(side, baseSide);
        System.out.println("Кількість 1 у двійковому поданні цілої частини значення суми периметрів: " + cl.CountOnesInBinary());
    }
    private static void ViewHistory(){
        System.out.println("1) Подивитись історію розмірів сторони у основи\n2) Подивитись історію розмірів основи\n3) Подивитись історію периметрів трикутників\n4) Подивитись історію периметрів прямокутників\n5) Подивитись історію суми периметрів\n6) Подивитись історію суми периметрів\n7) Подивитись історію всіх даних\nВедіть 0 якщо хочете вийти\n");
        System.out.print("Ведіть вашу відповідь: ");
        int answer = in.nextInt();
        if(answer > 6){
            cl.ViewHistory();
        }
        else if(answer == 0){
            return;
        }
        else{
            cl.ViewHistory(answer);
        }
    }
    private static void ViewLastInHistory(){
        cl.ShowLastDataInHistory();
    }
}

