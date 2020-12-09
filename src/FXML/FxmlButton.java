package FXML;

import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;

public class FxmlButton extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Для создания интерфейса из файла fxml применяется метод FXMLLoader.load().
        // Чтобы получить определение интерфейса из файла, используется метод getClass().getResource("Main.fxml")
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        //Метод FXMLLoader.load() возвращает объект типа Parent, который мы можем передать в конструктор объекта Scene.
        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(250);
        stage.setHeight(200);

        stage.show();
    }
}