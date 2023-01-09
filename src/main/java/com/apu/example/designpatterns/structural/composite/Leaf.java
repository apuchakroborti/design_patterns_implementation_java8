package com.apu.example.designpatterns.structural.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}