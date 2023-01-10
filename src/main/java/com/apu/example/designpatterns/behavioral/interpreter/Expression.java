package com.apu.example.designpatterns.behavioral.interpreter;

import java.util.Map;

interface Expression {
    public int interpret(Map<String, Expression> variables);
}
