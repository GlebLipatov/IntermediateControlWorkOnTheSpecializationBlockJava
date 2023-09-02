package Controller;

import Controller.LogicMenu.LogicMainMenu;
import Model.ModelEvent;
import View.ViewConsole;

public class Controller {

    private LogicMainMenu mainMenu;
    private ViewConsole view;
    private ModelEvent event;

    public Controller(ViewConsole view, ModelEvent event) {
        this.view = view;
        this.event = event;
        this.mainMenu = new LogicMainMenu(view, event);
    }

    /**
     * Запустить розыгрыш.
     *
     * @param path путь к файлу с информацией об уже выигранных игрушках.
     */
    public void start(String path) {
        mainMenu.init();
        event.loadPrizeToy(path);
        event.setIdLast();

        view.greeting();
        mainMenu.enter();
    }
}
