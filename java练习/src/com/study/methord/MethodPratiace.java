package com.study.methord;

/**
 * 首先描述关于方法的几个细节
 * 1.如果在本类中调用方法，直接写方法名即可
 * 2.如果想让一个方法返回多个结果，一个比较好的处理办法是将返回值用数组进行包装
 */
public class MethodPratiace {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        if (isEven(scanner.nextInt())){
//            System.out.println("这是偶数");
//        } else {
//            System.out.println("这是奇数");
//        }
//        char[][] showList = printChars(4,5,'+');
//        System.out.println(Arrays.deepToString(showList)+"\n");
        Person person = new Person();
        Person person2 = copyPerson(person);
        //比较两个对象是否在同一个内存空间内
        System.out.println(person == person2);
        System.out.println(person2.age+person2.name);

    }

    /**
     * 检测一个数是否为奇数还是偶数,返回boolean
     */
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    /**
     * 考虑一个方法有四个步骤、
     * 1.方法的返回类型
     * 2.方法的名字
     * 3.方法的形参
     * 4.方法体
     * 打印特定行数与列数的字符
     * 例####
     *  ####
     *  ####
     *  ####
     * @param row--打印的行数
     * @param column--打印的列数
     * @param character--要打印的字符
     *  可以用数组来对结果进行封装
     *  所以，适当地用数组进行包装，也是一种编程手段
     */
    public static char[][] printChars(int row,int column,char character){
        char[][] characterList = new char[column][row];
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row;j++){
                characterList[i][j] = character;
            }
        }
        return characterList;
    }

    /**
     * 对象拷贝
     * 要求创建一个新的对象，这个对象的内存地址和主栈地址不同，
     * 还是按照老分析思路
     * 1.方法的返回类型--Person类型对象
     * 2.方法的名字--
     * 3.方法的形参--Person类型对象
     * 4.方法体
     */
    public static Person copyPerson(Person p1){
        Person p2 = new Person();
        p2.age = p1.age;
        p2.name = p1.name;
        return p2;
    }

    private static class Person {
        String name = "123";
        int age = 54;
    }
}
