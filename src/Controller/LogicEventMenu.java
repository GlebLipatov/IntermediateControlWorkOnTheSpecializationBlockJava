package Controller;

import Model.ModelEvent;
import Model.ModelMenusData;
import View.ViewConsole;

public class LogicEventMenu {
    private final String ADD = "add";
    private final String NEXT = "next";
    private final String PLAY = "play";
    private final String EXIT = "exit";
    private ViewConsole view;
    private ModelEvent event;
    private ModelMenusData data;

    public LogicEventMenu(ViewConsole view, ModelEvent event, ModelMenusData data) {
        this.view = view;
        this.event = event;
        this.data = data;
    }

    public void enter() {
        String inputFromUser;
        boolean isContinue = true;



        while (isContinue) {
            inputFromUser = view.promptMenu(data.getEventMenu());
            switch (inputFromUser) {
                case ADD:
                    break;
                case NEXT:
                    break;
                case PLAY:
                    break;
                case EXIT:
                    isContinue = false;
            }
        }
    }
}
