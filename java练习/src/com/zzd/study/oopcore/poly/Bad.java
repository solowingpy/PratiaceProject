package com.zzd.study.oopcore.poly;

public class Bad extends Character {
    private static final String CHARACTER_STATE = "在背后迫害你";
    public Bad(String characterName) {
        super(characterName);
    }

    @Override
    public String showCharacter() {
        return super.showCharacter() + "\t" + CHARACTER_STATE;
    }
    public void effect() {
        System.out.println("把你拉向深渊");
    }
}
