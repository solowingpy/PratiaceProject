package com.zzd.study.oopcore.poly;

public class Kind extends Character{
    private static final String CHARACTER_STATE = "对你好";

    public Kind(String characterName) {
        super(characterName);
    }
    public Kind() {
    }

    @Override
    public String showCharacter() {
        return super.showCharacter() + "\t" + CHARACTER_STATE;
    }
    public void effect(){
        System.out.println("帮助你成长");
    }
}
