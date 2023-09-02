package Controller.LogicMenu;

import Model.ModelEvent;
import View.ViewConsole;

public class LogicMainMenu {
    private final int CATALOG = 1;
    private final int EVENT = 2;
    private final int EXIT = 3;
    private ViewConsole view;
    private ModelEvent event;
    private LogicEventMenu eventMenu;

    public LogicMainMenu(ViewConsole view, ModelEvent event) {
        this.view = view;
        this.event = event;
        this.eventMenu = new LogicEventMenu(view, event);
    }

    /**
     * Загрузка информации о меню и элементов меню.
     */
    public void init() {
        view.loadData();
        event.loadToyType();
    }

    /**
     * Вход в меню.
     */
    public void enter() {
        boolean isContinue = true;
        int inputFromUser;

        while (isContinue) {
            inputFromUser = view.promptMainMenu();

            switch (inputFromUser) {
                case CATALOG:
                    view.inDevelopment();
                    break;
                case EVENT:
                    eventMenu.enter();
                    break;
                case EXIT:
                    view.exit();
                    isContinue = false;
            }
        }
    }
}
