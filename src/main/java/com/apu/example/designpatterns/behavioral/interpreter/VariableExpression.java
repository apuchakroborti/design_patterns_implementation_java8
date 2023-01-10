package com.apu.example.designpatterns.behavioral.interpreter;

import java.util.Map;

class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (null == variables.get(name))
            return 0;
        return variables.get(name).interpret(variables);
    }
}