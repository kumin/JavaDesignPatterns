package com.kumin.creational.prototype;

public class HeadActionPrototype implements ActionPrototype {
    private String actionName;

    public HeadActionPrototype(String name) {
        this.actionName = name;
    }

    @Override
    public HeadActionPrototype clone() throws CloneNotSupportedException {
        return (HeadActionPrototype) super.clone();
    }

    @Override
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
