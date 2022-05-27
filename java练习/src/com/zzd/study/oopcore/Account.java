package com.zzd.study.oopcore;

/**
 * 封装的课堂练习
 * 封装的三步：属性私有化,生成get,set,添加对应业务逻辑
 * 注意构造方法也可以引用getset
 * @author zzd19
 */
public class Account {
    private String name;
    private String passWord;
    private double balance;

    public Account() {
    }

    /**
     * 不要忘记在构造器中用this来区分本对象的属性
     */
    public Account(String name, String passWord, double balance) {
        this.setName(name);
        this.setPassWord(passWord);
        this.setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = this.name.length();
        if (len >= 2 && len <= 4){
            this.name = name;
        } else {
            this.name = "";
            System.out.println("非法输入,已将名字设置为空");
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        int len  = this.passWord.length();
        if (len == 6){
            this.passWord = passWord;
        } else {
            this.passWord = "";
            System.out.println("非法输入,已将密码设置为空");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if ( this.balance > 20) {
            this.balance = balance;
        } else {
            this.balance = 20;
            System.out.println("非法输入,已将余额设置为"+this.balance);
        }
    }
    public void info(){
        //这里可以设置权限，只有合法的身份才可以访问密码
        System.out.println("账户信息:姓名:"+getName()+"密码"+getPassWord()+"账户余额"+getBalance());
    }
}
