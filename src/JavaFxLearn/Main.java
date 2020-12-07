package JavaFxLearn;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

//Главный класс приложения JavaFX должен наследоваться от класса Application
public class Main extends Application{

    public static void main(String[] args) {

        //И в методе main(String[] args), чтобы запустить само приложение JavaFX, представленное классом Application, вызывается метод launch(): После этого вызывается метод start
        Application.launch(args);
    }

    //класс имеет один абстрактный метод, который нам нужно реализовать:
    @Override
    //И в конце элемент Scene устанавливается для объекта Stage, который представляет пользовательский интерфейс. Например, на десктопах Stage будет представлять графическое окно.
    public void start(Stage stage) {

        // установка надписи
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        //элемент Group, который представляет контейнер для группы элементов
        Group group = new Group(text);

        //Элемент Group устанавливается в качестве корневого элемента Scene
        Scene scene = new Scene(group);     // создание сцены
        stage.setScene(scene);              // установка сцены для объекта Stage
        //И в конце элемент Scene устанавливается для объекта Stage.
        stage.setTitle("First Application"); // установка заголовка окна
        stage.setWidth(300);        // установка ширины окна
        stage.setHeight(250);       // установка длины окна
        stage.show();               // отображаем окно на экране устройства
    }
}