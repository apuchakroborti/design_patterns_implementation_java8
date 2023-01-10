package com.apu.example.designpatterns.behavioral.interpreter;

import java.util.Map;

class SubtractionExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return left.interpret(variables) - right.interpret(variables);
    }
}