package com.study.basicofjava.processcontrol;

import java.util.Scanner;

/**
 * @author zzd
 * 多重循环课堂练习题
 * 打印空心金字塔和空心菱形
 */
@SuppressWarnings({"AlibabaUndefineMagicConstant"})
public class Stars {
    /**
     * 题目较为复杂，我会将分析过程的每一个阶段都单独写一个方法，空心金字塔的效果：
     *                  *
     *                 * *
     *                *   *
     *               *     *
     *              *********
     */
    public static void main(String[] args) {
//        choice();
        step04Final();
    }

    /**
     * @author 韩顺平
     * 通过一点数学知识可以知道，空心金子塔(也就是等腰三角形)通常由矩形变化而来
     * 所以打印空心金字塔之前可以先打印一个相等行数的矩形来练手
     */
    static void step1(){
        //打印五行的矩形
        for (int i = 1;i <= 5;i++){
            for (int j = 1;j <= 5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * @author 韩顺平
     * 第二步，打印一个一半的金字塔，并由一半的金字塔推出打印完整金字塔的过程
     *       *
     *       **
     *       ***
     *       ****
     *       *****
     * 经过分析，用层数和星星数的对应关系来打印比较简单
     * 重点是找到层数和星星数的对应关系
     * 推导之后发现星星数和层数满足2n-1的关系，所以一半的三角形就能打印出来了
     */
    static void step02(){
        //控制层数
        for (int i = 1;i <= 5;i++){
            //控制每层的星星数
            for(int j = 1;j <= 2*i-1; j++){
               System.out.print("*");
           }
            //打完一层就要换行
            System.out.print("\n");
        }
    }

    /**
     * @author 韩顺平
     * 第三阶段，都打印一个完整的实心金字塔，
     * 如果实在分析不出来思路，可以先在纸上慢慢画出由一半的金字塔变为完整的金字塔的过程
     * 图样：
     *      *
     *     ***
     *    *****
     *   *******
     *  *********
     *  可以把这个金字塔结构放在一个矩形里面分析
     *  可以发现完成这个实心的金字塔不仅需要注意
     *  层数和星星的关系，而且还要注意每一层前面都会有空格
     *  就像这样
     * |||||||||||
     * |    *    |
     * |   ***   |
     * |  *****  |
     * | ******* |
     * |*********|
     * 所以，应该用三个循环来做这道题
     * 第一个循环控制层数，第二个循环控制每层前部的空格数，第三个循环控制每层的星星数
     * 还是以前的老方法，找出层数，与星星数，空格数的关系
     */
    static void step03(){
        for(int i = 1;i <= 5;i++){
            //打印前边的空格
            for (int j = 1;j <= 5 - i;j++){
                System.out.print(" ");
            }
            //打印星星
            for (int k = 1;k <= 2 * i -1;k++){
                System.out.print("*");
            }
            //最后不要忘了每执行完一个流程就要换行
            System.out.println();
        }
    }

    /**
     * @author zzd
     * 第四步，打印空心金字塔
     * 图样(已用矩形框架包裹)
     *                   |||||||||||||
     *                   |     *     |
     *                   |    * *    |
     *                   |   *   *   |
     *                   |  *     *  |
     *                   | *       * |
     *                   |***********|
     * 可以发现，空心金字塔的第一层和最后一层是基本上固定不变的
     * 第一层都是前面打出对应层数-1的空格后打出一个“*”
     * 最后一层都是打出2*层数-1个“*”
     * 变化的只是中间层，需要控制每一层前面的空格数和
     * 第一个星星和第二个星星之间的空格数
     * 这样程序就有三种执行情况
     * 1：在第一层时打印总层数-1个空格后打印出“*”
     * 2：在中间层控制每一层前面的空格和
     *    第一个和第二个“*”之间的空格数
     * 3：在最后一层打印出2*层数-1个“*”
     */
    static void step04(){
        //这个变量是一个专门的计数器，作用下面会讲到
        int count = 1;
        int layer = 10;
        //第一个循环，控制层数
        for (int i = 1;i <= layer;i++){
            /*
              不管怎么样，都要先打印出每一层前面的空格
              因为如果要绘制每一层的图案的话，都要首先打出每一层前面的空格
              打完每一层前面的空格后才能再进行各种讨论，来决定执行上面说的哪一种情况
              经过分析，发现每一层的空格的数量关系符合“总层数-当前层数”的数量关系
             */
            for (int j = 1;j <= layer - i;j++){
                System.out.print(" ");
            }
            //第一层，要打印出空心金字塔的顶端
            if (i == 1){
                System.out.print("*");
                System.out.print("\n");
                //下面的分支是控制空心金字塔的主体部分的打印
            } else if (i <= layer -1){
                System.out.print("*");
                /*
                  打印两个星号之间的空格
                  注意虽然每一层星号之间的空格数和层数符合“2n-1”的这种数量关系
                  但是程序运行到这里时控制层数的变量“i”已经来到了“2”这个值了
                  所以这个循环开始时，计数器计算此处会打印三个空格，导致整个程序混乱
                  如果重新分析这里的数量关系会比较困难，所以这里可以说体现了另一个编程思想：转化思想
                  我们可以重新定义一个新的变量"count"(就是前面提到的变量)
                  让这个循环的计数器重定向至“1”,这样的话就可以用这个变量来实现正确的“2n-1”的这种数量关系
                 */
                for(int k = 1;k <= 2*count-1;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
                //每执行一次循环，将计数器的值+1，来适应层数的变化
                ++count;
            } else {
                for (int a = 1;a <= 2* layer - 1;a++){
                    System.out.print("*");
                }
            }
        }
    }

    /**
     * @author zzd
     * 直接进行第五步，打印空心的菱形
     * 从图像的构成看，一个空心的菱形其实是两个空心金字塔组成的
     * 只不过一个是正金字塔，一个是倒金字塔而已
     * 根据化繁为简的编程思想，可以直接先打印一个倒金字塔，然后再想办法将正金字塔
     * 和倒金字塔组装成一个空心菱形
     * 最终图样(用矩形框架保围,并且星号之间的空格和每一层图案前的空格用符号填充)
     *                ||||||||
     *               |■■■*   |
     *               |■■*■*  |
     *               |■*■■■* |
     *               |*■■■■■*|
     *               |■*■■■* |
     *               |■■*■*  |
     *               |■■■*   |
     *               |||||||||
     * 我决定将打印正金字塔和倒金字塔的代码分别封装在两个不同的方法里，提高代码的可读性
     * 否则idea会提示“代码复杂度太高，代码的可读性会很低”
     *
     */

    static void step05Part1(){
        int layer = 8;
        //用来重定向打印两个星星之间空格的循环的计数器
        int count = 1;
        /*
          老样子，还是先用一个for循环控制层数
          不过要注意的是，这立的总层数虽然是8层
          但是只有前四层是用来打印正金字塔的
          其余四层是来打印倒金字塔的
          所以接下来的循环都要分两种情况讨论
         */
        for (int i = 1;i <= layer/2;i++){
            //先打印每一层前面的空格，照上面所说的，要分类讨论
            //前四层打印正三角形的情况
            for (int k = 1;k <= layer/2 - i;k++){
                System.out.print(" ");
            }
            if (i == 1){
                System.out.println("*");
            } else if (i >= 1 ){
                System.out.print("*");
                //打印两个星星之间空格的循环
                for (int k = 1;k <= 2*count -1;k++){
                    System.out.print(" ");
                }
                System.out.println("*");
                count++;
            }
        }
        step05Part2(layer);

    }



    /**
     * @author zzd
     * 这个方法提供一个选择，让人可以看到打印一个空心菱形的全部思考步骤
     * 这些步骤分别是{@link Stars#step1()},{@link Stars#step02()},{@link Stars#step03()}和
     * {@link Stars#step04()},{@link Stars#step05Part1()}
     */
    static void choice(){
        int choice;
        boolean isEnd = true;
        char willEnd;
        while(isEnd){
            System.out.print("请选择要观看的步骤");
            Scanner myScanner = new Scanner(System.in);
            choice = myScanner.nextInt();
            while(choice <= 0 || choice > 5){
                System.out.println("无效的输入，输入的数字必须介于0-5之间");
                choice = myScanner.nextInt();
            }
            switch(choice){
                case 1 -> step1();
                case 2 -> step02();
                case 3 -> step03();
                case 4 -> step04();
                default -> step05Part1();
            }
            System.out.print("打印完成，是否还要继续展示(Y/N)");
            willEnd = myScanner.next().charAt(0);
            if(willEnd == 'n' || willEnd == 'N'){
                isEnd = false;
            }
        }
    }


    /**
     * @author zzd
     * 改进打印空心菱形的逻辑
     * 改进后的逻辑：
     * 可以猜想，打印一个正金字塔和一个倒金字塔打印实际上就两种步骤：
     * 1.在第一层打印空格后打印星号
     * 2.从第二行到最后一层的图案实际上是在打印空格的过程中在适当位置打印两个星号而成的
     * 基于这个猜想，只要找到每一层需要打印多少个空格和需要在每一层那个位置打印星号就可以了
     * @deprecated 由于这种逻辑写出来的代码复杂度要比上个方法高，所以这个方法暂时弃用
     */
    @Deprecated (forRemoval = true )
    static void step05Test(){
        /*
          经过推理，得到如下规律：
          每一层需要打印的空格数=总层数+(当前层数-1)
          第一层情况不变，输出总层数-1个空格后直接输出一个星号
          从第二层开始，需要创建一个辅助变量count,每一层第一个星号
          需要在“每一层需要打印的总空格数-临时变量x2”处打印
          第二个星号都在最后一个空格处打印
          注意这个辅助变量在每一层的所有循环结束以后需要自增
         */

        int layer = 6;
        //辅助变量
        int count = 1;
        //层数循环
        for(int i = 1;i <= layer;i++) {
            //第一行的情况
            if (i == 1){
                for(int j = 1;j <= layer -1;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                //第二行到最后一行的空格总数
                for(int a = 1;a <= layer + (i - 1);a++){
                    //第一个星号需要打印的位置
                    if(a == (layer + (i - 1)) - count*2){
                        System.out.print("*");
                    }
                    //第二个星号需要打印的位置,打印完需要换行
                    else if(a == layer + (i - 1)){
                        System.out.println("*");
                    }
                    //如果不输出星号就打印空格
                    else {
                        System.out.print(" ");
                    }
                }
                count++;
            }
        }
    }

    /**
     * @author zzd
     * 打印倒金字塔的方法，这个方法将被包装在 {@link Stars#step05Part1()}里面
     * 这样做是为了降低代码复杂度
     * @see Stars#step05Part1()
     * @param layer 空心菱形的总层数，
     *
     */
    static void step05Part2(int layer){
        for ( int q = layer/2 - 1;q >= 1;q--){
            //打印倒金子塔前面的空格
            for(int a = 1;a <= layer/2 - q;a++){
                System.out.print(" ");
            }
            //判断程序是否开始打印倒金字塔的底部
            if (q != 1) {
                System.out.print("*");
                //控制倒金字塔两个星星之间的空格数
                for (int j = 1; j <= 2 * (q - 1) - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");

        }
    }

    /**
     * @author 韩顺平
     * 打印空心金字塔,这里展现的是老韩的思路
     * 老韩的思路比我的要简单，我的思路是对第一行和最后一行单独找规律
     * 然后按照“先打印每一层之前的空格，然后打印’*‘,再打印第二个星星之前的空格”
     * 这个思路“组装”空心金子塔中间的每一层
     * 老韩的思路则是直接找星号应该在哪里打印，类似于{@link Stars#step05Test()}的思路
     * 但是比我的思路简洁的多
     * @see Stars#step05Test()
     *
     */
    static void step04Final(){
        int totalLayer = 5;
        for(int a = 1; a <= totalLayer; a++){
            //老样子，还是打印每一层前面的空格
            for (int j = 1; j <= totalLayer - a; j++){
                System.out.print(" ");
            }
            //打印星星
            for (int k = 1; k <= 2 * a -1; k++){
                /*
                  到这里就有变化了,我的思路是每一行都是空格组成的
                  打空格的时候判定应该判在那个位置打印“*”
                  老韩倒是很直接，直接在打印“*”的循环加了限定条件，指明了应该在
                  每一行的第一个和最后一个“*”的位置打印“*”，其他位置打印空格
                  更有操作的是，判断是否是最后一层的代码也写在了一个if语句里面
                 */
                if (k == 1 || k == 2 * a -1 || a == totalLayer){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //最后不要忘了每执行完一个流程就要换行
            System.out.println();
        }
    }
}
