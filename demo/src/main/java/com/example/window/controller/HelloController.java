package com.example.window.controller;

import com.example.windows.Account;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Scanner;

/**
 * @author zzd19
 */
public class HelloController {
    @FXML
    TextField userNameFiled;
    @FXML
    PasswordField passWordFiled;
    static Account[] accountList;

    @FXML
    protected void onLoginButtonClicked() {
          System.out.println("demo");
     //TODO:加上简便的登录判断系统，如：输入给定的用户名，判断用户名是否正存在或正确；输入密码，判断密码是否与用户名匹配
    }
    @FXML
    protected void onExitButtonClicked() {
        System.exit(0);
        System.out.println("Exit");
    }
    @FXML
    protected Account onSignUpButtonClicked() {
        //下面设计一个控制台内的注册窗口，用两个临时变量来存储用户输入的账号密码
        System.out.println("请输入账号和密码");
        System.out.println("账号名：");
        Account account = new Account();
        System.out.println("密码：");
        Scanner scanner =  new Scanner(System.in);
        String temporaryUserId = scanner.nextLine();
        String temporaryUserPassword = scanner.nextLine();
        account.setUserName(temporaryUserId);
        account.setPassWord(temporaryUserPassword);
        char agreeCtr = scanner.nextLine().charAt(0);
        //noinspection AlibabaUndefineMagicConstant
        System.out.println("是否写入？(Y/N)");
        //noinspection AlibabaUndefineMagicConstant
        //noinspection AlibabaUndefineMagicConstant
        if (agreeCtr == 'y' || agreeCtr == 'Y') {
            writeToLise();
        }
        else //noinspection AlibabaUndefineMagicConstant
            if (agreeCtr == 'n' || agreeCtr == 'N'){
            System.exit(0);
        }
        return account;
        //TODO:设计一个注册页面
    }
    static void  writeToLise(){
        HelloController helloController = new HelloController();
        int flag = 1;
        while(flag < accountList.length){
            if (accountList[0] == null){
                accountList[0] = helloController.onSignUpButtonClicked();
            }
            if (accountList[flag] !=null){
                flag++;
            }
            else if (accountList[flag] == null) {
                accountList[flag] = helloController.onSignUpButtonClicked();
                break;
            }
        }
        //TODO:学完数组时会对数组进行排序，以实现更快的写入，但是现在就算了，遍历填入
    }
    
}
