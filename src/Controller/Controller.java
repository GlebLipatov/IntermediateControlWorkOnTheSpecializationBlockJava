package Controller;

import Model.ModelMenusData;
import Model.ModelEvent;
import View.ViewConsole;

public class Controller {

    private LogicMainMenu mainMenu;
    private ViewConsole view;
    private ModelEvent event;
    private ModelMenusData data;

    public Controller(ViewConsole view, ModelEvent event) {
        this.view = view;
        this.event = event;
        this.data = new ModelMenusData();
        this.mainMenu = new LogicMainMenu(view, event, data);
    }

    public void start() {
        mainMenu.enter();
    }
}
