package View;

import Model.EventItem.ModelToy;

import java.util.*;

/**
 * Выводит информацию в консоль.
 */
public class ViewConsole {
    private ViewMenu viewMenu;
    private ViewErrors viewErrors;

    public ViewConsole() {
        this.viewErrors = new ViewErrors();
        this.viewMenu = new ViewMenu(this.viewErrors);
    }

    public void loadData() {
        viewMenu.loadMenuData();
        viewErrors.loadErrorData();
    }

    public void greeting() {
        System.out.println("\nМагазин игрушек!");
    }

    public void inDevelopment() {
        System.out.println("\nДанный раздел в разработке(все таки магазин, а не русское лото) =)");
    }

    public int promptMainMenu() {
        viewMenu.showMainMenu();
        return viewMenu.promptMenu(viewMenu.sizeMainMenu());
    }

    public int promptEventMenu() {
        viewMenu.showEventMenu();
        return viewMenu.promptMenu(viewMenu.sizeEventMenu());
    }

    public int promptToyType(List<String> toyTypes) {
        showToyType(toyTypes);
        return viewMenu.promptMenu(toyTypes.size());
    }

    private void showToyType(List<String> toyTypes) {
        for (int i = 0; i < toyTypes.size(); i++) {
            System.out.printf("%d - %s", i, toyTypes.get(i) + "\n");
        }
        System.out.print("Выберите тип игрушки: ");
    }

    public void congratulations(ModelToy prize) {
        System.out.println("Поздравляем с выигрышем!!!");
    }

    public void showRandomSize(int weight) {
        System.out.println();
        if (weight == 1) System.out.println("Вы выиграли игрушку маленького размера");
        else if (weight == 2) System.out.println("Вы выиграли игрушку среднего размера");
        else System.out.println("Вы выиграли игрушку большого размера");
    }

    public void showPrizeInfo(String prizeInfo) {
        System.out.println(prizeInfo);
    }

    public void exit() {
        System.out.println("\nВсего доброго!");
    }
}
