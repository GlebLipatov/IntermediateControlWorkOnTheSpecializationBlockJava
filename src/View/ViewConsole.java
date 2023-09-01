package View;

import java.util.*;

public class ViewConsole {
    private Scanner scanner;
    private Map<String, List<String>> menusItems;

    public ViewConsole() {
        this.scanner = new Scanner(System.in);
    }

    public void loadMenusItems(Map<String, List<String>> menusItems) {
        this.menusItems = menusItems;
    }

    public void greeting() {
        System.out.println("\nМагазин игрушек!");
    }

    public String promptMenu(String menuTitle) {
        String inputFromUser;

        String menuItems = String.join(", ", this.menusItems.get(menuTitle));

        while (true) {
            System.out.printf("\n%s(введите %s): ", menuTitle, menuItems);
            inputFromUser = scanner.nextLine().toLowerCase();

            if (menusItems.get(menuTitle).contains(inputFromUser)) return inputFromUser;
        }
    }

    public void inDevelopment() {
        System.out.println("\nДанный раздел в разработке(все таки магазин, а не русское лото) =)");
    }

    public void exit() {
        System.out.println("\nВсего доброго!");
    }
}
