package FXML.JavaFxLearn;
import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.scene.Scene;
        import javafx.scene.Group;
        import javafx.scene.layout.FlowPane;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.paint.Color;

public class SimpleButton extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        //Создаем элементы - текст и кнопку
        Label label = new Label("Hello");               // текстовая метка
        Button button = new Button("Button");           // кнопка
        // Кнопку помещаем в контейнер
        Group group = new Group(button);                // вложенный узел Group

        // Внутрь FlowPane помещаем текст и контейнер.
        FlowPane root = new FlowPane(label, group);       // корневой узел
        Scene scene = new Scene(root, 300, 150 , Color.BLUE);        // создание Scene
        scene.setFill(Color.RED);
        stage.setScene(scene);                          // установка Scene для Stage

        stage.setTitle("Hello JavaFX");

        stage.show();
    }
}