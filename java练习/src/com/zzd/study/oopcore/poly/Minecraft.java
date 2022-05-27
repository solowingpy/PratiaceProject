package com.zzd.study.oopcore.poly;

public class Minecraft extends SandBoxGame{
    private String defaultPlayer;

    public Minecraft(String name, String defaultPlayer) {
        super(name);
        this.defaultPlayer = defaultPlayer;
    }

    public String getDefaultPlayer() {
        return defaultPlayer;
    }

    public void setDefaultPlayer(String defaultPlayer) {
        this.defaultPlayer = defaultPlayer;
    }

    @Override
    public String info() {
        return super.info() + defaultPlayer;
    }
}
