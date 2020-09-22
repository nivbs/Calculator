package IO;

import java.util.Scanner;

public class ConsoleInput implements IInputSystem {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
