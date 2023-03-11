package Task02;

import Task05.Menu;

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
        try {
            Menu menu = Menu.Initialize();
            while (true){
                menu.StartMenu();
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}

