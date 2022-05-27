package com.study.methord;

public class Tom {
    public int getGameNumberTom() {
        return gameNumberTom;
    }

    /**
     * Tom的出拳类型
     * 0表示石头,1表示剪刀,2表示布
     */
    private int gameNumberTom;
    /**
     * 随机生成Tom的出拳类型的方法
     */
    public void generateRandomGameNumber() {
        //使用while循环来尝试生成有效的随机数
        while(true){
            gameNumberTom = (int) (Math.random() * 10);
            if (gameNumberTom >= 0 && gameNumberTom <= 3){
                return;
            }
        }
    }
}
