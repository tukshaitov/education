package edu.pattern.gof.visitor;

/**
 * Created by Eldar on 11/8/2015.
 */
public class SymbolicLink implements Node {
    private String name;

    public SymbolicLink(String name) {
        this.name = name;
    }

    @Override
    public void accept(Operation operation) {
        operation.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}