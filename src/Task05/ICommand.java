package Task05;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public interface ICommand {
    public Scanner in = new Scanner(System.in);
    public int GetKey();
    public void PerformCommand();
}
