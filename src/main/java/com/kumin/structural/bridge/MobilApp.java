package com.kumin.structural.bridge;

public class MobilApp extends Project {
    public MobilApp(ProgrammingLang language) {
        super(language);
    }

    @Override
    public void code() {
        language.generateCode();
    }
}
