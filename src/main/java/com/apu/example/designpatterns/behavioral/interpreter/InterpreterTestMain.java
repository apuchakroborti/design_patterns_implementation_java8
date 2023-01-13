package com.apu.example.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/*
The interpreter design pattern is a behavioral design pattern that allows you
to define a language and use an interpreter to interpret sentences written in that language.
The interpreter pattern is used to define a language and create an interpreter that can interpret sentences in that language.
In this example, the interpreter pattern is used to evaluate simple mathematical expressions with variables.
The Evaluator class takes an expression in the form of a string,
and uses the Interpreter pattern to evaluate the expression.
The different types of expressions, such as addition, subtraction, multiplication, and division, are represented by different classes
that implement the Expression interface, and the interpret method is used to evaluate the expression.

In the main method, it creates an Evaluator object with the expression string "w x z - +"
which means (w+x) - z, and create a Map which holds the values of the variables.
The interpret() method is called on the Evaluator object, and the result is printed out.
*
*
* */

public class InterpreterTestMain {
    public static void main(String[] args) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new NumberExpression(5));
        variables.put("x", new NumberExpression(10));
        variables.put("z", new NumberExpression(42));

        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
