import IO.ConsoleInput;
import IO.ConsoleOutput;
import IO.IInputSystem;
import IO.IOutputSystem;
import Methods.IMethod;
import Methods.MethodsExecuter;

import java.util.ArrayList;
import java.util.Set;

public class CalculatorProcessor {
    private IInputSystem inputSystem;
    private IOutputSystem outputSystem;
    private final Set<String> methodsSign = MethodsExecuter.methods.keySet();

    public CalculatorProcessor() {
        inputSystem = new ConsoleInput();
        outputSystem = new ConsoleOutput();
    }

    public CalculatorProcessor(IInputSystem inputSystem, IOutputSystem outputSystem) {
        this.inputSystem = inputSystem;
        this.outputSystem = outputSystem;
    }

    public void run() {
        int countOfTabs = 0;
        String exercise = "";
        String input;
        do {
            do {
                input = inputSystem.read();
                if (input.equals(""))
                    countOfTabs++;
                else if (methodsSign.contains(input))
                    exercise += String.format(" %s", input);
                try {
                    Double.parseDouble(input);
                    exercise += String.format(" %s", input);
                } catch (NumberFormatException exception) {
                    outputSystem.print("please enter valid value");
                }
            } while (countOfTabs < 1);
            if(!methodsSign.contains(exercise.split(" ")[exercise.split(" ").length - 1])) {
                outputSystem.print(MethodsExecuter.executeExercise(exercise));
                countOfTabs=0;
            }
            else {
                outputSystem.print("please write valid exercise");
                countOfTabs--;
            }
            if (countOfTabs < 2) {
                //  outputSystem.print(methods);
            }
        } while (countOfTabs < 2);
    }
}
