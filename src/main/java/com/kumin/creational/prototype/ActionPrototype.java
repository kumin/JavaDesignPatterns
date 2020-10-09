package com.kumin.creational.prototype;

public interface ActionPrototype extends Cloneable {
    String getActionName();
    void setActionName(String name);

    ActionPrototype clone() throws CloneNotSupportedException;
}
