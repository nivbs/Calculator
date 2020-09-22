package Methods;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodsExecuter {
    public static HashMap<String, IMethod> methods = new HashMap<String, IMethod>() {
        {
            put("-", new MinusMethod());
            put("+", new PlusMethod());
        }
    };

    public static double executeExercise(String exercise) {
        String[] chars = exercise.split(" ");
        double firstNumber;
        double secondNumber;
        double answer = 0;
        for(String exerciseChar : chars) {
        }
    }
    //public double executeMethod(double firstNumber, double secondNumber, String method) {
    //    return methods.get(method).getAnswer(firstNumber, secondNumber);
    //}
}
