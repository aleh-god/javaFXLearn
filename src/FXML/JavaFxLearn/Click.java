package FXML.JavaFxLearn;
import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.scene.Scene;
        import javafx.scene.Group;
        import javafx.scene.control.Button;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;

public class Click extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button btn = new Button();
        btn.setText("Click!");

        //При нажатии на кнопку, создается объект Event, через который передается информация о событии.
        //В данном случае при нажатии на кнопку будет генерироваться событие типа javafx.event.ActionEvent (который наследуется от Event).
        //Для определения обработчика события используется функциональный интерфейс EventHandler.

        btn.setOnAction(new EventHandler<ActionEvent>() {

            //В методе handle определяются действия, которые будут вызываться при нажатии на кнопку
            @Override
            public void handle(ActionEvent event) {

                btn.setText("You've clicked!");
            }
        });

        Group root = new Group(btn);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(250);
        stage.setHeight(200);

        stage.show();
    }
}
