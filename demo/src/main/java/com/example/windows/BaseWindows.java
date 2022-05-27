package com.example.windows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author zzd19
 * 这是一个抽象的窗口类，提供了一个定义一个窗口所必须的长宽，和一个资源描述文件
 * 希望别的窗口类继承这个类时能够使用这个类的构造方法简化窗体的构建
 * @deprecated (此类未完成,暂时弃用,等待施工)
 */
@Deprecated(forRemoval = false)
public abstract class BaseWindows extends Application {

    private final double length;
    private final double width;
    private final String resFileName ;
    protected BaseWindows(double length, double width, String resFileName){
        this.length = length;
        this.width = width;

        this.resFileName = resFileName;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(BaseWindows.class.getResource(resFileName));
        Scene scene = new Scene(fxmlLoader.load(), length , width);
        stage.setScene(scene);
        stage.show();
    }
}
