package com.zzd.study.oopcore.poly;

public class Terraia extends SandBoxGame {
    private String gameType;

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Terraia(String name, String gameType) {
        super(name);
        this.gameType = gameType;
    }

    @Override
    public String info() {
        return super.info() + gameType;
    }
    public void open() {
        System.out.println("OK");
    }
}
