import Controller.Controller;
import Model.ModelEvent;
import View.ViewConsole;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModelEvent model = new ModelEvent();
        ViewConsole view = new ViewConsole();

        Controller controller = new Controller(view, model);

        controller.start();
    }
}