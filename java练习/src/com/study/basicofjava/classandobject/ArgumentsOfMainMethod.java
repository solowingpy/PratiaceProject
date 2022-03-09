package com.study.basicofjava.classandobject;

/**
 * @author zzd19
 * 此方法用来测试主方法的相关参数设置,以及简单说明主方法的相关参数问题
 */
public class ArgumentsOfMainMethod {
    /**
     *运行参数设置方法：IDEA，直接在“运行”工具栏里寻找“编辑配置”，在面就可以调所有可以运行的类的设置，包括参数个数和类型
     * @param args 参数为字符串数组，args[0]-args[n]代表一个程序的多个参数当然这些参数是数组
     */
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
