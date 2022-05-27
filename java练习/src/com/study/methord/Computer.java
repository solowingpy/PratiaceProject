package com.study.methord;

public class Computer {
    /**
     * 电脑的出拳类型
     */
    private int gameNumberComputer;
    public void generateRandomGameNumber(){
        while(true){
            gameNumberComputer = (int) (Math.random() * 10);
            if (gameNumberComputer >= 0 && gameNumberComputer <= 3){
                return;
            }
        }
    }

    public int getGameNumberComputer() {
        return gameNumberComputer;
    }
}
