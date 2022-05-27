package com.zzd.study.oopcore.poly;

/**
 * 多态数组演示
 * 一个数组的编译类型可以是父类类型，里面的实际元素是各个子类的类型
 */
public class PolyArry {


    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[1] = new Character("性格");
        characters[2] = new Kind("善良");
        characters[3] = new Kind("狼性精神");
        characters[0] = new Kind("敢于挑战");
        characters[4] = new Bad("表里不一");
        for (Character character : characters) {
            //遍历多态数组,调用父类的方法,这里用了动态绑定,方法的具体效果看运行类型
            System.out.println(character.showCharacter());
        }
        improve();
    }

    /**
     * instanceof关键字的使用
     * 改进多态数组，使之能调用子类当中特有的方法
     * 思路：instanceof判断运行类型,然后进行正确的向下转型
     */
    public static void improve(){
        Character[] characters = new Character[5];
        characters[1] = new Character("性格");
        characters[2] = new Kind("善良");
        characters[3] = new Kind("狼性精神");
        characters[0] = new Kind("敢于挑战");
        characters[4] = new Bad("表里不一");
        for (Character character : characters) {
            //判断当前运行类型是否为kind
            if (character instanceof Kind) {
                //向下转型为Kind
                ((Kind) character).effect();
            }
            if (character instanceof Bad) {
                //向下转型为Bad
                //根据动态绑定机制,这里所有的effect方法由运行类型来决定
                ((Bad) character).effect();
            }
        }
    }
}
