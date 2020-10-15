package com.kumin.structural.bridge;

public abstract class Project {
    protected ProgrammingLang language;

    public Project(ProgrammingLang language){
        this.language = language;
    }

    public abstract void code();
}
