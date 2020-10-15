package com.kumin.structural.bridge;

public class Website extends Project {
    public Website(ProgrammingLang language) {
        super(language);
    }

    @Override
    public void code() {
        language.generateCode();
    }
}
