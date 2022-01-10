import ConsoleView.ConsoleView;
import Controller.Controller;
import exceptions.AlreadyExists;
import repo.Lager;

public class main {

    public static void main(String[] args) throws AlreadyExists {

        Lager lager = new Lager();
        Controller controller = new Controller(lager);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.Run(controller);
    }
}