package com.study.basicofjava.stringpratiace;

/**
 * 字符串的处理方法还有equals方法比较字符串是否相同，toLowerCase方法替换字符串中的大写字母为小写字母，
 * toUpperCase方法替换字符串中的大写字母为小写字母
 * 由于这两个方法太过简单，不在用ConstructionOfString类的构造方法提供的字符串进行演示，此抽象类
 * 继承了ConstructionOfString类的构造方法，还将提供一个自定义字符串的方法，注入到ConstructionOfString的构造方法里
 * @author zzd19
 */
public abstract class AbstractEqualsTest extends ConstructionOfString {

    /**
     * 构造方法（函数）集成三种字符串初始方法
     * 参数是一个字符数组
     */
    protected AbstractEqualsTest(char[] arr) {
        super(arr);


    }

    /**
     * 此方法无参，无反回值，通过重载这个方法自行探索equal方法的使用
     * equal方法：用法str.equals(String otherstr),其中，str和otherstr是是要比较的两个字符串对象
     * 字符串也可以使用“==”进行比较，但是这样比较的是字符串的内存地址，并不比较两个字符串的内容
     * 而两个字符串的对象存放的内存地址不一样，用“==”比较永远返回false
     * java不能输出指针地址，没法演示两个字符串的地址不同
     */
    protected abstract void equalsCalc();

    /**
     * toUpperCase方法用于转换字符串中的小写字母为大写字母，用法为：str.toUpperCase
     * 其中str是任意字符串
     */
    protected abstract void toUpperCase();

    /**
     * toLowerCase方法用于将字符串中的大写字母转换为小写字母用法同toUpperCase
     */
    protected abstract void toLowerCase();

}
