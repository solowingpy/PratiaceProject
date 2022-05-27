package com.example.windows;

/**
 * @author zzd19
 * 设计账户类，就两个属性，一个是账户，一个是密码
 */
public class Account {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String passWord;

}
