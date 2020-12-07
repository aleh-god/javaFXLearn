package JavaFxLearn;
import javafx.application.Application;
        import javafx.stage.Stage;
        import java.util.List;

public class OverrideMethod extends Application{

    public static void main(String[] args) {

        System.out.println("Launching Application");
        Application.launch(args);
    }

    //init(): инициализирует приложение до его запуска.
    // Стоит отметить, что метод не должен использоваться для создания графического интерфейса или отдельных его частей.
    @Override
    public void init() throws Exception {


        System.out.println("Application inits");
        super.init();
    }

    //Вызывается метод start(javafx.stage.Stage), в который среда JavaFX передает созданный объект Stage. Таким образом, приложение начинает работать
    @Override
    public void start(Stage stage) {

        //Создание, а также изменение графического интерфейса должно производиться в потоке приложения или application thread. Именно в таком потоке и запускается метод start (а также метод stop).
        System.out.println("Application starts");

        // получаем переданные параметры
        Application.Parameters params = getParameters();
        List<String> unnamedParams = getParameters().getUnnamed();
        int i =0;
        for(String param: unnamedParams){
            i++;
            System.out.printf("%d - %s \n", i, param);
        }

        stage.show();
    }

    //Далее среда ожидает, пока либо в приложении не будет вызван программным способом метод Platform.exit(), либо пока не будет закрыто последнее окно программы.

    //stop(): вызывается после закрытия приложения, например, после того, как пользователь нажал на крестик в правом верхнем углу
    @Override
    public void stop() throws Exception {

        System.out.println("Application stops");
        super.stop();
    }
}