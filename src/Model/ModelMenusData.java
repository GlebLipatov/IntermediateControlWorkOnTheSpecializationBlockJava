package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelMenusData {
    private String mainMenu;
    private String eventMenu;
    private Map<String, List<String>> menusItems;

    public ModelMenusData() {
        this.menusItems = new HashMap<>();
    }

    public void load(){
        this.mainMenu = "Основное меню";
        this.eventMenu = "Розыгрыш игрушек";

        menusItems.put(mainMenu, new ArrayList<>());
        menusItems.put(eventMenu, new ArrayList<>());

        menusItems.get(mainMenu).add("catalog");
        menusItems.get(mainMenu).add("event");
        menusItems.get(mainMenu).add("exit");

        menusItems.get(eventMenu).add("add");
        menusItems.get(eventMenu).add("next");
        menusItems.get(eventMenu).add("play");
        menusItems.get(eventMenu).add("exit");
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public String getEventMenu() {
        return eventMenu;
    }

    public Map<String, List<String>> getMenusItems() {
        return menusItems;
    }
}
