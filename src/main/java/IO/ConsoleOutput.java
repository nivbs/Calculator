package IO;

public class ConsoleOutput implements IOutputSystem {
    @Override
    public void print(Object value) {
        System.out.println(value);
    }
}
