package ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView {

    public void Run(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        int repeat = 1;
        while (repeat == 1){
            System.out.println("1.Add Produkt\n2.Update Produkt\n3.Remove Produkt\n4.Exit");
            String input =scanner.next();
            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    repeat = 0;
                    break;
                default:
            }
        }
    }

}
