package com.zzd.study.oopcore.poly;

public class PolyTest {
    public static void main(String[] args) {
        LiuJiang liuJiang = new LiuJiang();
//        Kind kind = new Kind("对人和善");
//        Bad bad = new Bad("算计你");
        System.out.println("他在人前的表现======");
        Character character = new Kind("为人和善");
        System.out.println(liuJiang.showCharacter(character));
        System.out.println("他在背后的表现");
        character = new Bad("算计你");
        System.out.println(liuJiang.showCharacter(character));
//        Bad bad2 = (Bad) character;
//        Terraia terraia = new Terraia("Terraia","2D");
//        SandBoxGame sandBoxGame = new Terraia("Sand","2DGame");
//        向下转型是以向上转型为基础，向下转型的类型必须是向上转型的兼容类型
//        Terraia terraia = (Terraia) sandBoxGame;
//        terraia.open();
//        terraia.call();

    }
}
