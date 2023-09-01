package Controller;

import Model.ModelEvent;
import Model.ModelMenusData;
import View.ViewConsole;

public class LogicMainMenu {
    private final String CATALOG = "catalog";
    private final String EVENT = "event";
    private final String EXIT = "exit";
    private ViewConsole view;
    private ModelEvent event;
    private ModelMenusData data;
    private LogicEventMenu eventMenu;

    public LogicMainMenu(ViewConsole view, ModelEvent event, ModelMenusData data) {
        this.view = view;
        this.event = event;
        this.data = data;
        this.eventMenu = new LogicEventMenu(view, event, data);
    }

    public void enter() {
        data.load();
        view.loadMenusItems(data.getMenusItems());

        boolean isContinue = true;
        String inputFromUser;

        while (isContinue) {
            view.greeting();
            inputFromUser = view.promptMenu(data.getMainMenu());

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
