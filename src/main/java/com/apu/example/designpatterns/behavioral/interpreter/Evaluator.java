package com.apu.example.designpatterns.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

class Evaluator implements Expression {
    private Stack<Expression> expressionStack = new Stack<>();

    public Evaluator(String expression) {
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                Expression subExpression = new AdditionExpression(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                Expression subExpression = new SubtractionExpression(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("*")) {
                Expression subExpression = new MultiplicationExpression(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("/")) {
                Expression subExpression = new DivisionExpression(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.matches("\\d+")) {
                expressionStack.push(new NumberExpression(Integer.parseInt(token)));
            } else if (token.matches("[a-zA-Z]+")) {
                expressionStack.push(new VariableExpression(token));
            }
        }
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return expressionStack.pop().interpret(variables);
    }
}