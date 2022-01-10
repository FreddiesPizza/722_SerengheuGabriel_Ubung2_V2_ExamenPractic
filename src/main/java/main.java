import ConsoleView.ConsoleView;
import exceptions.AlreadyExists;

public class main {

    public static void main(String[] args) throws AlreadyExists {

        Lager lager = new Lager();
        Controller controller = new Controller(courseRepo,studentRepo,teacherRepo);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.Run(controller);
    }
}