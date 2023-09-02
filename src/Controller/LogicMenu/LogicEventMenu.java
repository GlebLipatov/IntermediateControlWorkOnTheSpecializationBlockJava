package Controller.LogicMenu;

import Controller.LogicEvent.LogicEvent;
import Model.EventItem.ModelToy;
import Model.ModelEvent;
import View.ViewConsole;

import java.io.FileWriter;
import java.io.IOException;

public class LogicEventMenu {
    private final int PLAY = 1;
    private final int INFO = 2;
    private final int EXIT = 3;
    private ViewConsole view;
    private ModelEvent event;
    private LogicEvent logicEvent;
    private String path;

    public LogicEventMenu(ViewConsole view, ModelEvent event) {
        this.view = view;
        this.event = event;
        this.logicEvent = new LogicEvent();
        this.path = "src\\Model\\Data\\win.csv";
    }

    /**
     * Вход в меню розыгрыша.
     */
    public void enter() {
        int inputFromUser;
        boolean isContinue = true;

        while (isContinue) {
            inputFromUser = view.promptEventMenu();
            switch (inputFromUser) {
                case PLAY:
                    int weight = logicEvent.getRandomWeight();
                    view.showRandomSize(weight);

                    int typeIndex = view.promptToyType(event.getToyType());
                    String type = event.getToyType().get(typeIndex);

                    ModelToy prize = event.getToy(weight, type);
                    view.congratulations(prize);
                    savePrize(path, prize);
                    break;
                case INFO:
                    view.showPrizeInfo(event.prizeInfo());
                    break;
                case EXIT:
                    isContinue = false;
            }
        }
    }

    /**
     * Сохранение информации об выданной игрушке в файл.
     *
     * @param path  путь к файлу.
     * @param prize игрушка.
     */
    private void savePrize(String path, ModelToy prize) {
        try (FileWriter file = new FileWriter(path, true)) {
            file.write(prize.toString());
            file.append('\n');
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
