package com.zzd.study.oopcore.poly;

public class Character {
    private String characterName;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Character(String characterName) {
        setCharacterName(characterName);
    }

    public Character() {
    }
    public String showCharacter(){
        return characterName;
    }
}
