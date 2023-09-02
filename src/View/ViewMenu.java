package View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс описывает меню и их пункты.
 */
public class ViewMenu {
    private final int MENUTITLE = 0;
    private ViewErrors viewErrors;
    private Map<Integer, String> mainMenu;
    private Map<Integer, String> eventMenu;
    private Scanner scanner;

    private String choiceMenuItem;

    public ViewMenu(ViewErrors viewErrors) {
        this.mainMenu = new HashMap<>();
        this.eventMenu = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.viewErrors = viewErrors;
    }

    public void loadMenuData() {
        mainMenu.put(0, "Основное меню");
        mainMenu.put(1, "Каталог");
        mainMenu.put(2, "Розыгрыш");
        mainMenu.put(3, "Выход");

        eventMenu.put(0, "Меню розыгрыша");
        eventMenu.put(1, "Разыграть");
        eventMenu.put(2, "Показать информацию по выигрышам");
        eventMenu.put(3, "Выход в основное меню");

        this.choiceMenuItem = "Выберите пункт меню: ";
    }

    public int sizeMainMenu() {
        return mainMenu.size();
    }

    public int sizeEventMenu() {
        return eventMenu.size();
    }

    public void showMainMenu() {
        System.out.println("\n" + mainMenu.get(MENUTITLE) + "\n");
        for (int i = 1; i < mainMenu.size(); i++) {
            System.out.printf("%d - %s\n", i, mainMenu.get(i));
        }
        System.out.print(choiceMenuItem);
    }

    public void showEventMenu() {
        System.out.println("\n" + eventMenu.get(MENUTITLE) + "\n");
        for (int i = 1; i < eventMenu.size(); i++) {
            System.out.printf("%d - %s\n", i, eventMenu.get(i));
        }
        System.out.print(choiceMenuItem);
    }

    public int promptMenu(int sizeMenu) {
        String inputFromUser;

        while (true) {
            inputFromUser = scanner.nextLine();
            if (isNumber(inputFromUser)) {
                int userChoice = Integer.parseInt(inputFromUser);
                if (userChoice > 0 && userChoice < sizeMenu)
                    return userChoice;
            }
            viewErrors.showFailedInputMenu(sizeMenu - 1);
        }
    }

    private boolean isNumber(String input) {
        for (char letter : input.toCharArray()) {
            if (!Character.isDigit(letter)) {
                return false;
            }
        }
        return true;
    }
}
