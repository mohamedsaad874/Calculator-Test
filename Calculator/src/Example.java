import com.calculator.expression.evaluation.Evaluator;
import com.calculator.expression.operators.VariablesScope;

import java.util.Scanner;



final public class Example {
    public static void main(String[] args) {
     simpleExample();

    }
private static void  commandLine(){
 final Scanner scanner = new Scanner(System.in);
 final VariablesScope variables =
         new VariablesScope.Builder()
         .setVar("a",2)
         .setVar("b",5)
         .setVar("c",10)
         .build();
 while (true){
     final String expressionText = scanner.nextLine();
     if(expressionText.isEmpty()){
     break;
     }else{
         final Evaluator evaluator = new Evaluator(expressionText, variables);
         final  int result = evaluator.evaluate();
         System.out.println(expressionText + ":=" + result);
     }
 }
}
private static void simpleExample(){
 final VariablesScope variables =
         new VariablesScope.Builder()
         .setVar(   "a",2)
         .setVar("b",3)
         .build();
 final String expressionText = "a b +";
 final Evaluator evaluator = new Evaluator(expressionText, variables);
 final  int result = evaluator.evaluate();
 System.out.println(result);
}
}
