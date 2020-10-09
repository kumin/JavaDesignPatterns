package com.kumin.creational.prototype;


public class EyesActionPrototype implements ActionPrototype{
    private String actionName;

    public EyesActionPrototype(String name) {
        this.actionName = name;
    }

    @Override
    public EyesActionPrototype clone() throws CloneNotSupportedException {
        return (EyesActionPrototype) super.clone();
    }

    @Override
    public String getActionName() {
        return actionName;
    }

    @Override
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
